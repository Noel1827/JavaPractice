public class SettersAndGetters {
    private int roll;
    private String name;

     public int getRoll(){return roll;}
     public void setRoll(int roll){this.roll=roll;}
     public String getname(){return name;}
     public void SetName(String name){this.name=name;}

     public void display(){
         System.out.println("Roll n.: "+roll);
         System.out.println("Student name: " + name);
     }

}
