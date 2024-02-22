package projetojava;

import javax.swing.JFrame;
public class projetojava {
    public projetojava() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new projetojava();
    }
}
