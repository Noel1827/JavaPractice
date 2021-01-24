import java.util.Scanner;

public class AgeWithInputt{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age in years: ");
        int ageInYear= input.nextInt();
        int ageInDays = ageInYear*365;
        System.out.println("Your are about " + ageInDays + " days old");
        
    }
}