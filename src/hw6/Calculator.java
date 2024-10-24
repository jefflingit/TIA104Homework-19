package hw6;

import java.util.InputMismatchException;

public class Calculator {

    public void powerXY(int x, int y) throws CalException, InputMismatchException {
        if (y<0){
            throw new CalException("次方為負值，結果回傳不為整數!");
        }else if(x==0 && y==0){
            throw new CalException("0的0次方沒有意義!");
        }

        System.out.printf("%d的%d次方等於%d\n",x,y,(int)Math.pow(x, y));

    }


}
