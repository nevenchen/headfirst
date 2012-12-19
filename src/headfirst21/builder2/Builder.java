package headfirst21.builder2;

//工人接口，定义了各个工人所要进行的工所作。他们负责进行具体部件如窗户，地板的建造。 
//同时因为房子是民工建的，因此建设完成后由他把房子递交回房主
public interface Builder {   
    
	  public  void makeWindow();   
	   
	  public  void makeFloor();   
	   
	  public  Room  getRoom();   
	}   

