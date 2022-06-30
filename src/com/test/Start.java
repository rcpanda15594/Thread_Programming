package com.test;

import javax.swing.JTextArea;

public class Start extends Thread {

private JTextArea ta;
    private boolean loopFlag;

    public Start(String name, JTextArea ta){
        super(name);
        this.ta = ta;
        ta.setText("");
        loopFlag = true;
    }
    public void run(){
        int num=0;
        while(true)
            while(loopFlag){
                num = 1+ (int)(Math.random()*100);
                ta.append(num + "\n");
            }
    }


    public void setLoopFlag(boolean value){
        loopFlag = value;
    }

}