import javax.swing.JOptionPane;

public class HelloWorldd {
    public static void main(String args[]){
        String fn = JOptionPane.showInputDialog("Enter First Number");
        String sn = JOptionPane.showInputDialog("Enter Second Number");

        int n1 = Integer.parseInt(fn);
        int n2 = Integer.parseInt(sn);
        int resunt = n1+n2;

        JOptionPane.showMessageDialog(null, "Thes sum is " + resunt, "SumThingy", JOptionPane.PLAIN_MESSAGE);
    }
    
}
