
public class ContinueOnLabeledForLoop {
    public static void main(String args[]){

        Hello: for(int i = 0; i < 3; i++){
            World: for(int j = 0; j < 3; j++){
                if(i==2 && j==2)
                continue Hello;
                System.out.println(i+" " + j);
            }
           
        }
    }
}
