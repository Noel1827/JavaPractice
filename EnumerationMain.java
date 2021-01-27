import java.util.EnumSet;

public class EnumerationMain {
    public static void main(String args[]) {
        for (Enumeration x : Enumeration.values())
            System.out.printf("%s\t%s\t%s\n", x, x.getDesc(), x.getChar());

        System.out.println("\nAnd now for the range of constants!!!\n");

        for (Enumeration x : EnumSet.range(Enumeration.hello, Enumeration.noel3))
            System.out.printf("%s\t%s\t%s\n", x, x.getDesc(), x.getChar());
    }
}
