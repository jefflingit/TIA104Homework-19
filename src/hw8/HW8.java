package hw8;


import java.math.BigInteger;
import java.util.*;

public class HW8 {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();

    }

    public static void question1(){
        ArrayList list = new ArrayList();
        list.add(new Integer(100));
        list.add(new Double(3.14));
        list.add(new Long(21L));
        list.add(new Short("100"));
        list.add(new Double(5.1));
        list.add("Kitty");
        list.add(new Integer(100));
        list.add(new Object());
        list.add("Snoppy");
        list.add(new BigInteger("1000"));

        //Iterator
        System.out.println("Iterator version：");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println("-".repeat(10));
        System.out.println("for loop：");

        //for loop
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("-".repeat(10));
        System.out.println("for each loop：");

        //for each loop
        for(Object obj:list){
            System.out.println(obj);
        }

        it = list.iterator();
        while(it.hasNext()){
            if(!(it.next() instanceof Number)){
                it.remove();
            }
        }

        System.out.println("after remove");

        for(Object obj:list){
            System.out.println(obj);
        }



    }

    public static void question2(){
        Train train1 = new Train(202,"普悠瑪","樹林","花蓮",400);
        Train train2 = new Train(1254,"區間","屏東","基隆",700);
        Train train3 = new Train(118,"自強","高雄","台北",500);
        Train train4 = new Train(1288,"區間","新竹","基隆",400);
        Train train5 = new Train(122,"自強","台中","花蓮",600);
        Train train6 = new Train(1222,"區間","樹林","七堵",300);
        Train train7 = new Train(1254,"區間","屏東","基隆",700);

        Set<Train> set = new HashSet<>();
        set.add(train1);
        set.add(train2);
        set.add(train3);
        set.add(train4);
        set.add(train5);
        set.add(train6);
        set.add(train7);

        Iterator it = set.iterator();
        while(it.hasNext()){
            Train train = (Train)it.next();
            System.out.println(train.toString());
        }
    }

    public static void question3(){
        Train train1 = new Train(202,"普悠瑪","樹林","花蓮",400);
        Train train2 = new Train(1254,"區間","屏東","基隆",700);
        Train train3 = new Train(118,"自強","高雄","台北",500);
        Train train4 = new Train(1288,"區間","新竹","基隆",400);
        Train train5 = new Train(122,"自強","台中","花蓮",600);
        Train train6 = new Train(1222,"區間","樹林","七堵",300);
        Train train7 = new Train(1254,"區間","屏東","基隆",700);
        List<Train> trains = new ArrayList<>();
        trains.add(train1);
        trains.add(train2);
        trains.add(train3);
        trains.add(train4);
        trains.add(train5);
        trains.add(train6);
        trains.add(train7);
        Collections.sort(trains);

        for(int i=0;i<trains.size();i++){
            System.out.println(trains.get(i).toString());
        }

    }


    public static void question4(){
        Train train1 = new Train(202,"普悠瑪","樹林","花蓮",400);
        Train train2 = new Train(1254,"區間","屏東","基隆",700);
        Train train3 = new Train(118,"自強","高雄","台北",500);
        Train train4 = new Train(1288,"區間","新竹","基隆",400);
        Train train5 = new Train(122,"自強","台中","花蓮",600);
        Train train6 = new Train(1222,"區間","樹林","七堵",300);
        Train train7 = new Train(1254,"區間","屏東","基隆",700);
        Set<Train> treeSet = new TreeSet<>();
        treeSet.add(train1);
        treeSet.add(train2);
        treeSet.add(train3);
        treeSet.add(train4);
        treeSet.add(train5);
        treeSet.add(train6);
        treeSet.add(train7);

        for(Train train:treeSet){
            System.out.println(train.toString());
        }



    }
}
