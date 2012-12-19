package headfirst10.interpreter;

import java.util.HashMap;


public class AddExpression extends SymbolExpression {   
    public AddExpression(Expression _left, Expression _right) {   
        super(_left, _right);   
    }   
  
    // 把左右两个表达式运算的结果加起来   
    public int interprete(HashMap<String, Integer> var) {   
        return super.left.interprete(var) + super.right.interprete(var); 
        
    }   
    
}

