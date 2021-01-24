import java.util.Scanner;

public class Averaging {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int number, counter = 0, average, total = 0;

        while (counter < 10) {
            number = input.nextInt();
            total += number;
            counter++;
        }
        average = total/counter;

        System.out.println("The average is: " +  average);

    }
}
