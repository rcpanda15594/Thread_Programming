package com.test;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Timercheck extends TimerTask{
// my first thread
Thread t1 = new Thread(){
     public void run(){
        for(int i = 1;i <= 10;i++)
        {
            System.out.println("Thread1-------------------"+i);
        }           
     }
 };

// my second thread
Thread t2 = new Thread(){
     public void run(){
        for(int i = 11;i <= 20;i++)
        {
            System.out.println("Thread2-------------------"+i);
        }           
     }
 };

public static void main(String[] args){
      long ONCE_PER_DAY = 1000*60*60*24;
      System.out.println("ONCE_PER_DAY-------------------"+ONCE_PER_DAY);
     Calendar calendar = Calendar.getInstance();
     calendar.set(Calendar.HOUR_OF_DAY, 12);
     System.out.println("Calendar-------------------"+calendar);
     calendar.set(Calendar.MINUTE, 05);
     
     System.out.println("Calendar-------------------"+calendar);
     calendar.set(Calendar.SECOND, 00);
     
     System.out.println("Calendar-------------------"+calendar);
     Date time = calendar.getTime();

     System.out.println("time-------------------"+time);
     TimerTask check  = new Timercheck();
     Timer timer = new Timer();
     System.out.println("time-------------------"+timer);
     timer.scheduleAtFixedRate(check, time ,ONCE_PER_DAY);
}

@Override    
// run method of timer task
public void run() {
    t1.start();
    t2.start();
}
}
