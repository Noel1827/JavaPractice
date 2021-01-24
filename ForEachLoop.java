public class ForEachLoop {
    public static void main(String args[]){
        int bucky[] = {3,4,5,6,7}, total = 0;

        for(int x:bucky){
            total+= x;
        }
        System.out.println(total);
    }
}
