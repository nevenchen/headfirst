package headfirst20.chainofresponsibility;


public class RequestTeacher implements Request { 

	@Override
	  public void execute() { 
	    System.out.println("[RequestTeacher] :\t Teachers request has been accepted!"); 
	  } 

	@Override
	  public String getType() { 
	    return "TeacherRequest"; 
	  } 
	} 

