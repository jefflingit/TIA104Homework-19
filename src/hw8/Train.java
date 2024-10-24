package hw8;

import java.util.Objects;

public class Train implements Comparable<Train>{
    private int number;
    private String type;
    private String start;
    private String dest;
    private double price;

    public Train(){};

    public Train(int number,String type, String start,String dest,double price){
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;

    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "Train[number="+number+",type="+type+",start="+start+",dest="+dest+",price="+price+"]";
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        Train train = (Train) o;
        return number==train.number && price==train.price && type.equals(train.type) && start.equals(train.start)  && dest.equals(train.dest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, type, start, dest, price);
    }

    @Override
    public int compareTo(Train o) {
        if(this.number>o.number){
            return 1;
        }else if(this.number<o.number){
            return -1;
        }else{
            return 0;
        }
    }
}
