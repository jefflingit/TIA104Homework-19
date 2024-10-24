package hw5.ext;

public class Pencil extends Pen{
    public Pencil(){}

    public Pencil(String name, int price){
        super(name, price);
    }

    @Override
    public void write(){
        System.out.println("輸出為削鉛筆再寫");
    }

    @Override
    public int getPrice(){
        return (int)((double)(super.getPrice())*0.8);
    }
}
