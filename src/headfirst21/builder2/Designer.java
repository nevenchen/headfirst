package headfirst21.builder2;


//设计师。他知道房子应该怎么设计，但他不会自己去建造，而是指挥民工去建造。   
public class Designer {   
   
  // 指挥民工进行工作   
  public void order(Builder  builder) {   
    builder.makeWindow();   
    builder.makeFloor();   
  }   
}   

