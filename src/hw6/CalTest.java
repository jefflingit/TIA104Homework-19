package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            try{
                System.out.println("請輸入x的值：");
                int x = in.nextInt();
                System.out.println("請輸入y的值：");
                int y = in.nextInt();
                Calculator calulator = new Calculator();
                calulator.powerXY(x,y);
                break;
            }catch(CalException e){
                System.out.println(e.getMessage());
            }catch(InputMismatchException e){
                System.out.println("輸入格式不正確");
                in.nextLine();
            }
        }

        in.close();





    }
}
