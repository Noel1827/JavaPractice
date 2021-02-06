import java.util.*;

public class ConversListtoArray {
    // public static void main(String args[]) {
    //     String[] stuff = { "babies", "watermelong", "melons", "fudge" };
    //     LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
    //     thelist.add("pumpkinf");
    //     thelist.addFirst("firstthing");
    //     // convert back to an array
    //     stuff = thelist.toArray(new String[thelist.size()]);
    //     for (String x : stuff)
    //         System.out.printf("%s ", x);
    // }
    public static void  main(String[] args){
        String[] stuff = {"hello", "noel", "whatup", "africa"};
        LinkedList<String> list1 = new LinkedList<String>(Arrays.asList(stuff));

        list1.add("BABY");
        list1.addFirst("FIRSTTHINGBABY");

        stuff = list1.toArray(new String[list1.size()]);
        for (String x : stuff)
                System.out.printf("%s ", x);
    }
}
