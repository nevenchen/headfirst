package headfirst20.chainofresponsibility;


public class RequestSchoolmaster implements Request { 

	@Override
	  public void execute() { 
	    System.out.println("[RequestSchoolmaster] :\t Schoolmasters request has been accepted!"); 
	  } 

	@Override
	  public String getType() { 
	    return "SchoolmasterRequest"; 
	  } 
	} 

