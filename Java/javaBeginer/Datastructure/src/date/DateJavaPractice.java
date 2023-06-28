package date;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

public class DateJavaPractice {
    public static void main(String[] args) {
    /*
    * Timer:  A facility for thread to schedule task for future execution in background thread
    *
    * TimerTask: A task that can be scheduled  for one time or repeated  execution by a Timer*/

        Timer timer = new Timer();
        TimerTask timertask = new TimerTask() {
            int counter = 10;
            @Override
            public void run() {
                if(counter > 0){
                    System.out.println(counter + " sec");
                    counter --;
                }else {
                    System.out.println("The task is over :)");
                    timer.cancel();
                }
            }
        };
        Calendar date = Calendar.getInstance();

        date.set(Calendar.YEAR,2020);
        date.set(Calendar.MONTH,Calendar.JUNE);
        date.set(Calendar.DAY_OF_MONTH,20);
        date.set(Calendar.HOUR_OF_DAY,0);
        date.set(Calendar.MINUTE,0);
        date.set(Calendar.SECOND,0);
        date.set(Calendar.MILLISECOND,0);

//        timer.schedule(timertask,0);
//          timer.schedule(timertask,date.getTime());
          timer.scheduleAtFixedRate(timertask,0,1000);
    }
}
