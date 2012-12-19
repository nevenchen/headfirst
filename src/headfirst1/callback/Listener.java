package headfirst1.callback;


public class Listener {   
	       
	    private final Callback callback;   
	       
	    public static interface Callback {   
	        public void begin();   
	        public void end();   
	    }   
	    public Listener(Callback callback) {   
	        this.callback = callback;   
	    }   
	    public void doIt() {   
	        callback.begin();   
	        System.out.println("do something ...");   
	        callback.end();   
	    }   
	}  
