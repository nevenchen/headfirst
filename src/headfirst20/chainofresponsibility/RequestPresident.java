package headfirst20.chainofresponsibility;


public class RequestPresident implements Request { 

	@Override
	  public void execute() { 
	    System.out.println("[RequestPresident] :\t Presidents request has been accepted!"); 
	  } 

	@Override
	  public String getType() { 
	    return "PresidentRequest"; 
	  } 
	} 

