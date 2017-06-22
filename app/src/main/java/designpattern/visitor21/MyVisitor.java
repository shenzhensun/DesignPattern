package designpattern.visitor21;

/**
 * Created by JohnSun on 2016/5/11.
 */
public class MyVisitor implements Visitor {
    @Override
    public void visitor(Subject subject) {
        System.out.println("visit the subject："+subject.getSubject());
    }
}
