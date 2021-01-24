public class Methods {

    public static void findEven(int number) {
        if (number % 2 == 0) {
            System.out.println("its even");
        } else
            System.out.println("ODD");
    }

    public static void main(String args[]) {
        int number = Integer.parseInt(args[0]);
        findEven(number);
    }
}
