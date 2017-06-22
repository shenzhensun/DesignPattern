package designpattern.visitor21;

/**
 * Created by JohnSun on 2016/5/11.
 */
public class TestVisitor  {

    public static void main(String[] args) {



        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }


}
