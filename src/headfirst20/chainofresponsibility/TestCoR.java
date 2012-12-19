package headfirst20.chainofresponsibility;


public class TestCoR { 
	  public static void main(String[] args) { 
	    Handler handler = new HandlerStudent(new HandlerTeacher(new HandlerSchoolmaster(null))); 
	   
	    Request studentReq = new RequestStudent(); 
	    Request teacherReq = new RequestTeacher(); 
	    Request schoolmasterReq = new RequestSchoolmaster(); 
	    Request presidentReq = new RequestPresident(); 
	   
	    //传入student request 
	    handler.handleRequest(studentReq); 
	    System.out.println("-----------"); 
	    //传入teacher request 
	    handler.handleRequest(teacherReq); 
	    System.out.println("-----------"); 
	    //传入schoolmaster request 
	    handler.handleRequest(schoolmasterReq); 
	    System.out.println("-----------"); 
	    //传入president request 
	    handler.handleRequest(presidentReq); 
	    System.out.println("-----------"); 
	  } 
	} 

