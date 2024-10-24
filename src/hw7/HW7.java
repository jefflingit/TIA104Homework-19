package hw7;

import java.io.*;

public class HW7 {
    public static void main(String[] args) {
        question1();
        question2();
        copyFile("./data/Sample.txt","./data/Copy.txt");
        question4();
        question5();

    }

    public static void question1(){
        File dir = new File("./data");
        File file = new File(dir,"Sample.txt");


        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String str;

            int count=0;
            int charCount=0;
            while((str=br.readLine())!= null){
                count++;
                charCount+=str.length();
            }

            System.out.println("共有"+file.length()+"個bytes");
            System.out.println("共有"+charCount+"個字元");
            System.out.println("共有"+count+"行");


        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }

    }

    public static void question2(){
        try{
            FileWriter fw = new FileWriter("./data/Data.txt",true);


            int randomNum;

            for(int i=0;i<10;i++){
                randomNum=(int)(Math.random()*999+1);
                fw.write((String.valueOf(randomNum)));
                fw.write(" ");
            }
            fw.flush();
            fw.close();

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }


    }

    public static void copyFile(String original,String copyTo){
        try {
            FileReader fr = new FileReader(original);
            FileWriter fw = new FileWriter(copyTo);
            int c;
            while((c=fr.read())!=-1){
                fw.write(c);
                fw.flush();
            }
            fw.close();
        }catch(FileNotFoundException e){
        }catch (IOException e) {
        }

    }


    public static void question4(){
        File dir = new File("./data");
        if(!dir.exists()){
            dir.mkdir();
        }
        File file = new File(dir,"Object.ser");
        Animal[] animals = new Animal[4];
        animals[0]=new Cat("Tom");
        animals[1]=new Cat("Tom2");
        animals[2]=new Dog("Max");
        animals[3]=new Dog("Max2");

        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(Animal animal:animals){
                oos.writeObject(animal);
                oos.flush();
            }
            oos.close();
            fos.close();

        }catch (FileNotFoundException e) {

        }catch (IOException e) {

        }

    }

    public static void question5(){
        File file = new File("./data/Object.ser");
        try{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true){
                ((Animal)ois.readObject()).speak();
            }
        }catch (FileNotFoundException e) {
        }catch (IOException e) {
        }catch (ClassNotFoundException e) {
        }


    }
}
