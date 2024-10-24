package hw4;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW4 {

    public static void main(String[] args){
        question1(new int[]{29,100,39,41,50,8,66,77,95,15});
        question2("Hello World");
        question3(new String[]{"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"});
        question3Ver2(new String[]{"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"});
        question4();
        question5();
        question5Ver2();
        question6();
    }



    public static void question1(int[] arr){
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double avg = sum/arr.length;
        System.out.println("Average: "+avg);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>avg){
                System.out.printf("%d ",arr[i]);
            }
        }

    }


    public static void question2(String s){
        char[] arr = s.toCharArray();
        char[] resultArr = new char[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            resultArr[(arr.length-1)-i]=arr[i];
        }

        String result = String.valueOf(resultArr);
        System.out.println(result);
    }

    public static void question2Ver2(String s){
        //string builder version
        StringBuilder str = new StringBuilder(s);
        System.out.println(str.reverse());
    }

    public static void question3(String[] arr){
        String vowels = "aeiou";
        int count = 0;
        String[] elements;
        for(int i=0;i<arr.length;i++){
            elements = arr[i].split("");
            for(int j=0;j<elements.length;j++){
                if(vowels.contains(elements[j])){
                    count++;
                }
            }
        }


        System.out.printf("共 %d 個母音 ",count);

    }





    public static void question3Ver2(String[] arr){
        // Regex version
        String vowels = "[aeiouAEIOU]";
        Pattern pattern = Pattern.compile(vowels);

        int matches = 0;

        for(int i=0;i<arr.length;i++){
            Matcher matcher = pattern.matcher(arr[i]);
            while(matcher.find()){
                matches++;
            }
        }

        System.out.printf("共 %d 個母音\n",matches);

    }


    public static void question4(){
        Scanner in =  new Scanner(System.in);
        System.out.println("請輸入借款金額：");
        int[][] arr ={{25,32,8,19,27},{2500,800,500,1000,1200}};
        int need = in.nextInt();
        int count = 0;
        String employeeIds="";
        for(int i=0;i<arr[1].length;i++){
            if(arr[1][i]>=need){
                employeeIds=employeeIds+arr[0][i]+" ";
                count++;
            }
        }

        System.out.printf("有錢可借的員工編號：%s共%d人！",employeeIds,count);
        in.close();

    }

    public static void question5(){
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner in = new Scanner(System.in);
        int totalDays = 0;
        int year;
        int month;
        int day;
        boolean isLeapYear;

        System.out.println("請輸入日期：YYYY MM DD");

        while(true){
            year = in.nextInt();
            month = in.nextInt();
            isLeapYear = false;
            if(year%400==0){
                isLeapYear = true;
            }else{
                if(year%4==0 && year%100!=0){
                    isLeapYear = true;
                }
            }

            day = in.nextInt();
            if(month==2){
                if(isLeapYear){
                    if(day>29){
                        System.out.println("請重新輸入日期：YYYY MM DD");
                    }else{
                        break;
                    }
                }else {
                    if(day>28) {
                        System.out.println("請重新輸入日期：YYYY MM DD");
                    }else{
                        break;
                    }
                }
            }else if(day>days[month-1]){
                System.out.println("請重新輸入日期：YYYY MM DD");
            }else{
                break;
            }
        }



        for(int i=0;i<month-1;i++){
            totalDays+=days[i];
        }

        if(isLeapYear){
            totalDays=totalDays+day+1;
        }else{
            totalDays=totalDays+day;
        }
        System.out.printf("輸入的日期為該年第%d天",totalDays);
        in.close();
    }


    public static void question5Ver2(){
        // Date version

        Scanner in = new Scanner(System.in);
        boolean isLeapYear;
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        int year;
        int month;
        int day;
        System.out.println("請輸入日期：YYYY MM DD");
        while(true) {
            isLeapYear = false;
            year = in.nextInt();
            month = in.nextInt();
            day = in.nextInt();
            if(month==2){
                if(isLeapYear){
                    if(day>29){
                        System.out.println("請重新輸入日期：YYYY MM DD");
                    }else{
                        break;
                    }
                }else {
                    if(day>28) {
                        System.out.println("請重新輸入日期：YYYY MM DD");
                    }else{
                        break;
                    }
                }
            }else if(day>days[month-1]){
                System.out.println("請重新輸入日期：YYYY MM DD");
            }else{
                break;
            }

        }
        LocalDate date = LocalDate.of(year,month,day);
        int dayOfYear = date.getDayOfYear();
        System.out.printf("輸入的日期為該年第%d天",dayOfYear);


    }


    public static void question6(){
        int[][] scores = {
                {10, 35, 40, 100, 90, 85, 75, 70},
                {37, 75, 77, 89, 64, 75, 70, 95},
                {100, 70, 79, 90, 75, 70, 79, 90},
                {77, 95, 70, 89, 60, 75, 85, 89},
                {98, 70, 89, 90, 75, 90, 89, 90},
                {90, 80, 100, 75, 50, 20, 99, 75}
        };

        int[] maxCount = new int[8];

        // initial setup
        int idOfMax = 0;
        int max = 0;

        for(int i=0;i<scores.length;i++){
            for(int j=0;j<scores[i].length;j++){
                if(scores[i][j]>max){
                    max = scores[i][j];
                    idOfMax=j;
                }
            }
            maxCount[idOfMax]+=1;
            max=0;
        }

        for(int i=0;i<maxCount.length;i++){
            System.out.printf("學號 %d 的最高分次數為 %d 次\n",i+1,maxCount[i]);
        }

    }
}
