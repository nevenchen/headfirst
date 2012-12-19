package headfirst1.callback;


public class Callback implements Listener.Callback {   
	  
	    private Listener a;   
	       
	    public void begin() {   
	        System.out.println("begin ...");   
	    }   
	  
	    public void end() {   
	        System.out.println("end ...");   
	    }   
	       
	    public Callback() {   
	        this.a = new Listener(this);   
	    }   
	}   
