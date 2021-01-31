import javax.swing.JFrame;

public class EventHandlerMain {
    public static void main(String args[]){

        EventHandler noel = new EventHandler();
        noel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        noel.setSize(350,100);
        noel.setVisible(true);


    }
}
