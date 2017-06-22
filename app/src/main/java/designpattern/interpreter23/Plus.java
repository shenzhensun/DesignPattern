package designpattern.interpreter23;

/**
 * Created by JohnSun on 2016/5/11.
 */
public class Plus implements Expression {
    @Override
    public int interpret(MyContext context) {
        return context.getNum1()+context.getNum2();
    }
}
