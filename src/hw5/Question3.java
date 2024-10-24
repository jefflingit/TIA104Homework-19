package hw5;

public class Question3 {
    public int maxElement(int[][] x){
        int max=x[0][0];
        int last=x[0][0];

        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                if(x[i][j]>max){
                    max=x[i][j];
                    last=x[i][j];
                }
            }
        }
        return max;
    }

    public double maxElement(double[][] x){
        double max=x[0][0];
        double last=x[0][0];

        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                if(x[i][j]>max){
                    max=x[i][j];
                    last=x[i][j];
                }
            }
        }
        return max;

    }
}
