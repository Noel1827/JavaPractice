import java.util.*;
import java.util.*;

public class LinkedListt {
    public static void main(String args[]) {
        String[] things = { "apples", "noobs", "pwnge", "bacon", "goATS" };
        List<String> list1 = new LinkedList<String>();
        for (String x : things)
            list1.add(x);

            String[] things2 = {"sausage", "bacon", "goats", "harrypotter" };
            List<String> list2 = new LinkedList<String>();
            for(String y: things2)
            list2.add(y);

            list1.addAll(list2);
            list2 = null;

            printMe(list1);
            removeStuff(list1,2,5);
            printMe(list1);
            reverseMe(list1);

    }
}
