package Gotoclass;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BackFrontTest {
    private JLabel label;
    public  BackFrontTest(){
        JFrame frame=new JFrame();
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label =new JLabel(new ImageIcon(""));
        JPanel panel=new JPanel();
        panel.add(label);
        frame.add(panel);
        frame.addMouseListener((MouseListener) new MyListener());
    }
    class MyListener<number> extends MouseAdapter{
        int number;
        public MyListener(){}


    }
    public void mouseClicked(MouseEvent event){
        int number = 0;
        number++;
        if(number%2==1){
            label.setIcon(new ImageIcon(""));

        }
        else {
            label.setIcon(new ImageIcon(""));

        }

    }
    public static void main(String[] args){
        new BackFrontTest();
    }
}
