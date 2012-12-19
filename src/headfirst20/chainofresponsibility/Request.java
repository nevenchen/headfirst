package headfirst20.chainofresponsibility;


public interface Request { 
	  //请求类型 
	  public String getType(); 
	  //执行任务 
	  public void execute(); 
	} 

