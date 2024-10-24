package hw5.ext;

public class Main {
    public static void main(String[] args) {
        Pen[] pens = {new Pencil("brandA",100),new InkBrush("brandB",100)};
        for(Pen pen:pens){
            pen.write();
            System.out.println(pen.getPrice()+"元");
        }
    }
}
