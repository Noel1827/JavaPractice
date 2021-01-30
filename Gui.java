import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui extends JFrame{
    private JLabel item1;

    public Gui(){
        super("This is the title");
        setLayout(new FlowLayout());
        item1 = new JLabel("This is a sentence");
        item1.setToolTipText("This will show up if your mouse is in the sentence");
        add(item1);
    }
}


// import java.awt.FlowLayout;
// import javax.swing.JFrame;
// import javax.swing.JLabel;

// public class Gui extends JFrame {
//     private JLabel item1;

//     public Gui(){
//         super("The title bar");
//         setLayout(new FlowLayout());

//         item1 = new JLabel("this is a sentence");
//         item1.setToolTipText("This is gona show up on hover");
//         add(item1);
//     }

// }