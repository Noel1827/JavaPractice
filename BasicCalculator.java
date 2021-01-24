import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args){
        Scanner noel = new Scanner(System.in);

        double fnum, snum,answer;
        System.out.println("Enter the first number: ");
        fnum = noel.nextDouble();
        System.out.println("Enter the second number: ");
        snum = noel.nextDouble();
        answer = fnum+snum;
        System.out.println(answer);
    }
}
