package headfirst8.observer.kettle;

import java.util.Observable;
import java.util.Observer;


public class Alarm implements Observer {   
	  
	    public void makeAlarm() {   
	    	try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
	        System.out.println("报警器->嘀嘀嘀...水已经烧开 ");   
	    }   
	    public void update(Observable o, Object arg) {   
	        makeAlarm();   
	        System.out.println(o.getClass());
	        System.out.println("arg:" + arg);
	    }   
	}  
