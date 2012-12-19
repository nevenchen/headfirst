package headfirst21.builder2;


//房主。房主的任务就是聘请一个民工，一个设计师，同时把民工给设计师指挥，督促设计师开展工作。最后从民工手上收房。     
public class Client {     
     
  public static void main(String[] args) {     
     Builder mingong = new Mingong();     
     Designer  designer = new  Designer();     
     designer.order(mingong);     
     mingong.getRoom();     
  }     
}    
