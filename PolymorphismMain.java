
public class PolymorphismMain {
    public static void main(String args[]){
       Polymorphismkid2 arr[]= new Polymorphismkid2[2];
       arr[0] = new Polymorphismkid1();
       arr[1] = new Polymorphismkid3();

        for(int x=0; x<2;x++)
            arr[x].eat();
        

    }
}
