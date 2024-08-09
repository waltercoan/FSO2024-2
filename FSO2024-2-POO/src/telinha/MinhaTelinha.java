package telinha;

import javax.swing.JFrame;

public class MinhaTelinha extends JFrame{
    public MinhaTelinha() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String args[]){
        new MinhaTelinha();
    }
}
