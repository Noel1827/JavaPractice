import java.util.*;
public class ListReverseAndCOpy {
    public static void main(String args[]){
        // create an array to convert to list
        Character[] ray = {'p', 'w','n'};
        List<Character> list1 = Arrays.asList(ray);
        System.out.println("List is: ");
        output(list1);

        // reverse and printout the list
        Collections.reverse(list1);
        System.out.println("After reverse : ");
        output(list1);
            
        // create a new array and a new list
        Character[] newRay  = new Character[3];
        List<Character> listCopy = Arrays.asList(newRay);

        // copy contents of list int listcopy
        Collections.copy(listCopy,list1);
        System.out.println("Copy of list: ");
        output(listCopy);

        // fill collection with crap
        Collection.fill(list1,'X');
        System.out.println("After filling the list: ");
        output(list1);
    }
}
