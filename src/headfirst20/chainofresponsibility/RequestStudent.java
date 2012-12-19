package headfirst20.chainofresponsibility;


public class RequestStudent implements Request { 

	@Override
	  public void execute() { 
	    System.out.println("[RequestStudent] :\t Students request has been accepted!"); 
	  } 

	@Override
	  public String getType() { 
	    return "StudentRequest"; 
	  } 
	} 

