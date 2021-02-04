
public class PolymorphismMain {
    public static void main(String args[]){
      Polymorphismkid4 noel = new Polymorphismkid4();
      Polymorphismkid2 father = new Polymorphismkid3(); // it gets an error because the class is abstract because that class is only used for inheritance :)
      Polymorphismkid1 son = new Polymorphismkid1();
      noel.digest(son);
      noel.digest(father);
        

    }
}
