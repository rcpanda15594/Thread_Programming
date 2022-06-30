package com.test;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class LoopTest extends JFrame implements ActionListener {//******
    private JButton startB, stopB;
    private JTextArea oa;
    Start sta;

    public LoopTest(){
        super("Final Exam: Question ");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        startB = new JButton("START"); c.add(startB);

        stopB = new JButton("STOP"); c.add(stopB);

        oa = new JTextArea(5,20); c.add(oa);
        c.add(new JScrollPane(oa));

        registerEvents();
        sta = new Start("Loop", oa);

    }
    public void registerEvents(){
        startB.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent ae){
                        if(startB.isEnabled() == true )
                            sta.setLoopFlag(true);
                        if(!sta.isAlive())
                            sta.start();
                        startB.setEnabled(false);

                    }
                }
        );

        stopB.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent ae){
                        if(stopB.isEnabled()==true){
                            sta.setLoopFlag(false);

                        }

                    }

        }

        );
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
    public static void main(String[] args){
        LoopTest app = new LoopTest();
        app.setSize(300,300);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

}