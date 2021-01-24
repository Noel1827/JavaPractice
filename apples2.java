import java.util.Scanner;
public class apples2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        tuna tunaObject = new tuna();

        String temp = input.nextLine();
        tunaObject.setName(temp);
        tunaObject.Saying();
        
    }
    
}
