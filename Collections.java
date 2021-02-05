import java.util.*;
public class Collections {
    // public static void main(String args[]){
    //     String []arr = {"eggs","lasers","hats","pie"};
    //     List<String> list1 = new ArrayList<String>();
    //     // add array items to list

    //     for(String x:arr){
    //         list1.add(x);
    //     }

    //     String[] morethings ={"lasers","hats"};
    //     List<String> list2 = new ArrayList<String>();
        
    //     for(String y:morethings){
    //      list2.add(y);
    //     }

    //     for(int i = 0; i < list1.size(); i++){
    //         System.out.printf("%s ", list1.get(i));
    //     }

    //     editlist(list1,list2);
    //     System.out.println();

    //     for(int i = 0; i < list1.size(); i++){
    //         System.out.printf("%s ", list1.get(i));
    //     }
    // }
    // public static void editlist(Collection<String> l1, Collection<String> l2){
    //     Iterator<String> it = l1.iterator();
    //     while(it.hasNext()){
    //         if(l2.contains(it.next())){
    //             it.remove();
    //         }
    //     }
    // }

    public static void main(String args[]){
        String[] items1 = {"hole", "noel", "taysha", "alondra"};
        String[] items2 = {"noel", "taysha"};
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        for(String x:items1){
            list1.add(x);
        }
        for(String x: items2){
            list2.add(x);
        }

        for(String x: list1){
            System.out.printf("%s ", x);
        }
        System.out.println();
        
        removeD(list1,list2);
      for(int i = 0; i < list1.size(); i++){
          System.out.printf("%s ", list1.get(i));
      }


    }
    public static void removeD(Collection<String> l1, Collection<String> l2){
        Iterator<String> it = l1.iterator();
        while(it.hasNext()){
            if(l2.contains(it.next()))
            it.remove();
        }
    }
}
