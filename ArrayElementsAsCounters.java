import java.util.Random;

public class ArrayElementsAsCounters {
    public static void main(String args[]) {
        Random rand = new Random();
        int arr[] = new int[7];

        for (int i = 0; i < 1000; i++) {
            arr[rand.nextInt(6) + 1]++;
        }

        System.out.println("Index\tNumber");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "\t" + arr[i]);
        }

    }
}
