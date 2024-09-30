package hw1;

public class HW1 {
    public static void main(String[] args){
        System.out.println("Q1");
        question1();
        System.out.println("Q2");
        question2();
        System.out.println("Q3");
        question3();
        System.out.println("Q4");
        question4();
        System.out.println("Q5");
        question5();
        System.out.println("Q6");
        question6();

    }


    public static void question1(){
        System.out.println("12 + 6 = "+ (12+6));
        System.out.println("12 x 6 = "+ (12*6));
        System.out.println("-".repeat(20));
    }


    public static void question2(){
        int totalAmount = 200;
        int dozen = 12;
        int numOfDozen = totalAmount/12;
        int numOfLeftOver = totalAmount%12;

        System.out.printf("共%d打%d顆\n",numOfDozen,numOfLeftOver);
        System.out.println("-".repeat(20));
    }

    public static void question3(){
        int totalSecond = 256559;
        int day = totalSecond/86400;
        int hour = (totalSecond%86400)/3600;
        int minute = ((totalSecond%86400)%3600)/60;
        int second = ((totalSecond)%86400%3600%60);

        System.out.println("共 "+day+" 天 "+hour+" 小時 "+minute+" 分 "+second+ "秒");
        System.out.println("-".repeat(20));


    }

    public static void question4(){
        final double PI = 3.1415;
        double radius = 5.0;
        double area = PI*radius*radius;
        double circumference = 2*PI*radius;
        System.out.println("圓面積 = "+area);
        System.out.println("圓周長 = "+circumference);
        System.out.println("-".repeat(20));
    }


    public static void question5(){
        double principal = 1_500_000;
        double interestRate = 0.02;
        double yearOfInvestment = 10.0;
        double totalAmount = principal*Math.pow((1+interestRate),yearOfInvestment);
        System.out.printf("終值=%.3f\n",totalAmount);
        System.out.println("-".repeat(20));
    }

    public static void question6(){
        System.out.println(5+5); // 10，int與int相加，結果同一般整數運算
        System.out.println(5+'5'); //58，char與int相加，會將char自動轉換成對應unicode的int值後與int相加
        System.out.println(5+"5"); //55，String與int相加，會將int轉換成String相加，String的相加是將字串與字串相接形成一新字串
        System.out.println("-".repeat(20));

    }


}
