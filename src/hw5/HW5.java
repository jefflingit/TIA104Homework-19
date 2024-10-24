package hw5;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("請輸入寬與高：");
        int width = in.nextInt();
        int height = in.nextInt();
        starSquare(width,height);

        randAvg();

        int[][] intArray={
                {1,6,3},
                {9,5,2}
        };

        double[][] doubleArray={
                {1.2,3.5,2.2},
                {7.4,2.1,8.2}
        };

        Question3 q = new Question3();
        System.out.println(q.maxElement(intArray));
        System.out.println(q.maxElement(doubleArray));

        genAuthCode2();
        in.close();
    }


    public static void starSquare(int width,int height){

        for(int i=0;i<height;i++){
            System.out.println("*".repeat(width));
        }
    }

    public static void randAvg(){
        int[] randoms = new int[10];
        int sum = 0;
        for(int i=0;i<randoms.length;i++){
            randoms[i]= (int)(Math.random()*100);
            sum += randoms[i];
        }
        int avg = sum/randoms.length;
        System.out.println("本次亂數結果：");
        for(int i=0;i<randoms.length;i++){
            System.out.print(randoms[i]+" ");
        }
        System.out.println("");
        System.out.println(avg);
    }

    public static void genAuthCode(){
        int[] codePool = new int[62];
        int numFlag = 48;
        int upperCaseFlag = 65;
        int lowerCaseFlag = 97;

        for(int i=0;i<10;i++){
            codePool[i]=numFlag;
            numFlag++;
        }
        for(int i=10;i<36;i++){
            codePool[i]=upperCaseFlag;
            upperCaseFlag++;
        }
        for(int i=36;i<62;i++){
            codePool[i]=lowerCaseFlag;
            lowerCaseFlag++;
        }

        String authCode ="";
        boolean flag = true;
        while(flag) {
            authCode = "";
            for (int i = 0; i < 8; i++) {
                authCode += (char) (codePool[(int) (Math.random() * 62)]);
            }
            String[] elements =authCode.split("");
            for(String s: elements){
                if("0123456789".contains(s)){
                    flag=false;
                    break;
                }
            }
        }
        System.out.println("本次隨機產生驗證碼為：");
        System.out.println(authCode);

    }

    public static void genAuthCode2(){
        String pool = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String authCode ="";
        int numOfNum = 0;
        int numOfUpper = 0;
        int numOfLower = 0;
        boolean flag = true;
        int randomIndex = 0;
        while(flag){
            authCode = "";
            for (int i = 0; i < 8; i++) {
                randomIndex = (int) (Math.random() * 62);
                authCode += pool.charAt((randomIndex));
                if(randomIndex<10){
                    numOfNum++;
                }else if(randomIndex>=36){
                    numOfUpper++;
                }else{
                    numOfLower++;
                }
            }
            if(numOfNum>0 && numOfUpper>0 && numOfLower>0){
                flag=false;
            }
        }

        System.out.println("本次隨機產生驗證碼為：");
        System.out.println(authCode);

    }
}
