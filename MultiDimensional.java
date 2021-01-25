public class MultiDimensional {
    public static void main(String args[]){
        int firstarray[][]={
            {8,9,0,10},
            {12,3,4,5}
        };

        int secondarray[][]={{1,2,3},{2},{24,34}};
        display(secondarray);

    }
    public static void display(int x[][]){
        for(int i=0; i < x.length;i++){
            for(int j = 0; j<x[i].length; j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}
