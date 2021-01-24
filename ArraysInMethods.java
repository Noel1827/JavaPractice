public class ArraysInMethods {
    public static void main(String args[]) {
        int bucky[] = { 2, 3, 4, 5, 6 };
        change(bucky);

        for(int y:bucky){
            System.out.println(y);
        }
    }

    public static void change(int x[]) {
        for (int i = 0; i < x.length; i++) {
            x[i] *= 10;
        }
    }
}
