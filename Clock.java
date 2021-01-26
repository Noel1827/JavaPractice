public class Clock {
 public static void main(String args[]){
     MultipleConstructorsClock obj = new MultipleConstructorsClock();
     MultipleConstructorsClock obj2 = new MultipleConstructorsClock(5);
     MultipleConstructorsClock obj3 = new MultipleConstructorsClock(5,13);
     MultipleConstructorsClock obj4 = new MultipleConstructorsClock(5,13,43);

     System.out.printf("%s\n", obj.toMilitary());
     System.out.printf("%s\n", obj2.toMilitary());
     System.out.printf("%s\n", obj3.toMilitary());
     System.out.printf("%s\n", obj4.toMilitary());
     
 }
}

// USSE THIS FOR THE MILITARY, AND NORMAL TIME :)
   // public static void main(String args[]) {
    //     TimeClass timeObj = new TimeClass();

    //     System.out.println(timeObj.toMilitary());

    //     timeObj.setTime(13, 27, 6);
    //     System.out.println(timeObj.toMilitary());
    //     System.out.println(timeObj.toString());
        
    // }