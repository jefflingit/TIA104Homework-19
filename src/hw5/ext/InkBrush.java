package hw5.ext;

public class InkBrush extends Pen{

    public InkBrush(){}

    public InkBrush(String name, int price) {
        super(name, price);
    }

    @Override
    public void write(){
        System.out.println("沾墨汁再寫");
    }

    @Override
    public int getPrice(){
        return (int)((double)super.getPrice()*0.9);
    }
}
