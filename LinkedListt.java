import java.util.*;
import java.util.*;

public class LinkedListt {
    // public static void main(String args[]) {
    //     String[] things = { "apples", "noobs", "pwnge", "bacon", "goATS" };
    //     List<String> list1 = new LinkedList<String>();
    //     for (String x : things)
    //         list1.add(x);

    //         String[] things2 = {"sausage", "bacon", "goats", "harrypotter" };
    //         List<String> list2 = new LinkedList<String>();
    //         for(String y: things2)
    //         list2.add(y);

    //         list1.addAll(list2);
    //         list2 = null;

    //         printMe(list1);
    //         removeStuff(list1,2,5);
    //         printMe(list1);
    //         reverseMe(list1);

    // }

    // //printMe method
    // private static void printMe(List<String> l){
    //     for(String x:l)
    //     System.out.printf("%s ",x);
    //     System.out.println();
    // }

    // private static void removeStuff(List<String> l,int from, int to ){
    //     l.subList(from, to).clear();
    // }

    // private static void reverseMe(List<String> l){
    //     ListIterator<String> it = l.listIterator(l.size());
    //     while(it.hasPrevious())
    //     System.out.printf("%s ", it.previous());
    // }
    public static void main(String args[]){
        String[] things = {"noel", "Alondra", "butt", "UPRM", "bacon"};
        String[] things2 = {"puta", "mamona", "hello"};

        List<String> list1 = new LinkedList<String>();
        List<String> list2 = new LinkedList<String>();

        for(String x: things)
        list1.add(x);
        for(String x: things2)
        list2.add(x);

        list1.addAll(list2);
        list2 = null;

        printMe(list1);
        removestuff(list1,3,4);
        printMe(list1);
        reverseMe(list1);

    }
   //printMe method
    private static void printMe(List<String> l){
        for(String x:l)
        System.out.printf("%s ",x);
        System.out.println();
    }

    private static void removestuff()
}
