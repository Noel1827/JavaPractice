import java.util.Scanner;
public class UserDefinedMethod {
    public static void findEven(int number){
        if(number%2==0){
            System.out.println("Even");
        }else System.out.println("Odd");
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        findEven(num);
    }
    
}
