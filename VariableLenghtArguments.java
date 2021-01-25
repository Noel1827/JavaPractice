public class VariableLenghtArguments {
    public static void main(String args[]) {
        test(false,true,true,false,true);

    }

    public static void test(Boolean... string) {
        int counter = 0;
        for (Boolean x : string) {
            if (x) {
                counter++;
            }
        }
        System.out.println("There are "+ counter + " true's");

    }
}
