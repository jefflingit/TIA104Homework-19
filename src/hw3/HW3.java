package hw3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class HW3 {
    public static void main(String[] args){
//        question1();
//        question1Advanced();
//        question2();
//        question2Advanced();
//        question3();
//        question3Advanced();
//        question3Advanced2();

    }


    public static void question1(){
        Scanner in = new Scanner(System.in);
        System.out.println("請輸入三個整數：");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if( (a+b>c) && (a+c>b) && (b+c>a)){
            if((a==b)&&(b==c)){
                System.out.println("正三角形");
            }else if((a==b)||(b==c)||(a==c)){
                System.out.println("等腰三角形");
            }else{
                System.out.println("其他三角形");
            }
        }else{
            System.out.println("不是三角形");
        }
        in.close();
    }


    public static void question1Advanced(){
        Scanner in = new Scanner(System.in);
        System.out.println("請輸入三個整數：");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if( (a+b>c) && (a+c>b) && (b+c>a)){
            if((a==b)&&(b==c)){
                System.out.println("正三角形");
            }else if((a==b)||(b==c)||(a==c)){
                System.out.println("等腰三角形");
            }else if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(b*b+c*c==a*a)){
                System.out.println("直角三角形");
            }else{
                System.out.println("其他三角形");
            }
        }else{
            System.out.println("不是三角形");
        }
        in.close();

    }

    public static void question2(){
        Scanner in = new Scanner(System.in);
        int target=(int)(Math.random()*10);
        while(true){
            if(target == 10 ){
                target = (int)(Math.random()*10);
            }else{
                break;
            }
        }

        System.out.println("開始猜數字吧：");
        while(true){
            if(in.nextInt() == target){
                System.out.printf("答對了！答案就是%d",target);
                break;
            }else{
                System.out.println("猜錯囉");
            }
        }
        in.close();

    }

    public static void question2Advanced(){
        Scanner in = new Scanner(System.in);
        int target=(int)(Math.random()*100);
        System.out.println("開始猜數字吧：");
        while(true){
            int guess = in.nextInt();
            if(guess==target){
                System.out.printf("答對了！答案就是%d",target);
                break;
            }else if(guess>target){
                System.out.println("太大了");
            }else{
                System.out.println("太小了");
            }
        }
        in.close();
    }


    public static void question3(){
        Scanner in = new Scanner(System.in);
        System.out.println("阿文...請輸入你討厭哪個數字？");
        int target = in.nextInt();
        int count=0;
        for(int i=1;i<=49;i++){
            String j = Integer.toString(i);
            if(!(j.contains(Integer.toString(target)))){
                System.out.print(i+" ");
                count++;
            }
        }

        System.out.printf("\n可選擇的數字共有 %d 個\n",count);
        in.close();
    }

    public static void question3Advanced(){

        //確認可選的數字
        Scanner in = new Scanner(System.in);
        System.out.println("阿文...請輸入你討厭哪個數字？");
        int target = in.nextInt();
        int[] pool = new int[49];
        int count=0;
        for(int i=1;i<=49;i++){
            String j = Integer.toString(i);
            if(!(j.contains(Integer.toString(target)))){
                pool[count]=i;
                count++;
            }
        }
        System.out.printf("共有%d個數字可選\n",count);

        // 亂數取出6個不重複的索引
        int[] randArr = new int[6];
        int pickCount=0;
        boolean isUnique = true;

        while(pickCount<6){
            int random;
            do{
                random = (int)(Math.random()*(count));
                for(int i=0;i<randArr.length;i++){
                    if(random == randArr[i]){
                        isUnique = false;
                        break;
                    }
                }
            }while(!isUnique);
            randArr[pickCount]=random;
            pickCount++;
        }

        //取出6個數字
        Arrays.sort(randArr);
        for(int i=0;i<randArr.length;i++){
            System.out.printf("%d ",pool[randArr[i]]);
        }
        in.close();
    }

    public static void question3Advanced2(){
        //確認可選的數字
        Scanner in = new Scanner(System.in);
        System.out.println("阿文...請輸入你討厭哪個數字？");
        int target = in.nextInt();
        int[] pool = new int[49];
        int count=0;
        for(int i=1;i<=49;i++){
            String j = Integer.toString(i);
            if(!(j.contains(Integer.toString(target)))){
                pool[count]=i;
                count++;
            }
        }
        System.out.printf("共有%d個數字可選\n",count);
        Set<Integer> uniqueNumbers = new HashSet<>();
        while(uniqueNumbers.size()<6){
            int random = (int)(Math.random()*(count));
            uniqueNumbers.add(pool[random]);
        }
        Object[] randArr = uniqueNumbers.toArray();
        Arrays.sort(randArr);
        for(int i=0;i<randArr.length;i++){
            System.out.printf("%d ",randArr[i]);
        }
        in.close();
    }

}
