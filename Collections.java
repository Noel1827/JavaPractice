import java.util.*;
public class Collections {
    public static void main(String args[]){
        String []arr = {"eggs","lasers","hats","pie"};
        List<String> list1 = new ArrayList<String>();
        // add array items to list

        for(String x:arr){
            list1.add(x);
        }

        String[] morethings ={"lasers","hats"};
        List<String> list2 = new ArrayList<String>();
        
        for(String y:morethings){
         list2.add(y);
        }

        for(int i = 0; i < list1.size(); i++){
            System.out.printf("%s ", list1.get(i));
        }

        editlist(list1,list2);
        System.out.println();

        for(int i = 0; i < list1.size(); i++){
            System.out.printf("%s ", list1.get(i));
        }
    }
}
