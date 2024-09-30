package hw2;


public class HW2 {
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
        System.out.println("Q7");
        question7();
    }


    public static void question1(){
        int sum = 0;
        for(int i=1;i<=1000;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
        System.out.println("-".repeat(20));

    }
    public static void question2(){
        int product=1;
        for(int i=1;i<=10;i++){
            product*=i;
        }
        System.out.println(product);
        System.out.println("-".repeat(20));
    }

    public static void question3(){
        int product = 1;
        int count = 1;
        while(count<=10){
            product*=count;
            count++;
        }
        System.out.println(product);
        System.out.println("-".repeat(20));
    }
    public static void question4(){
        for(int i=1;i<=10;i++){
            System.out.printf("%.0f ",Math.pow(i,2));
        }
        System.out.println();

        System.out.println("-".repeat(20));
    }

    public static void question5(){
        int count=0;
        for(int i=1;i<=49;i++){
            String j = Integer.toString(i);
            if(!(j.contains("4"))){
                System.out.print(i+" ");
                count++;
            }
        }

        System.out.printf("\n可選擇的數字共有 %d 個\n",count);


        System.out.println("-".repeat(20));
    }
    public static void question6(){

        for(int i=10;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("-".repeat(20));
    }
    public static void question7(){

        //version 1

        String[] arr = {"A","B","C","D","E","F"};

        String symbol;
        for(int i=0;i<arr.length;i++){
            symbol = arr[i];
            System.out.printf(symbol.repeat(i+1)+"\n");
        }

        System.out.println("-".repeat(20));

        // version 2

//        String symbol="";
//        for(int i=1;i<=6;i++){
//            switch(i){
//                case 1:
//                    symbol = "A";
//                    break;
//                case 2:
//                    symbol = "B";
//                    break;
//                case 3:
//                    symbol = "C";
//                    break;
//                case 4:
//                    symbol = "D";
//                    break;
//                case 5:
//                    symbol = "E";
//                    break;
//                case 6:
//                    symbol = "F";
//                    break;
//            }
//
//            String result = "";
//            for(int j=1;j<=i;j++){
//                result+=symbol;
//            }
//            System.out.println(result);
//        }
    }

}


