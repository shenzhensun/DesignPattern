package designpattern.visitor21;

/**
 * Created by JohnSun on 2016/5/11.
 */
public interface Subject {

    void accept(Visitor visitor);

    String getSubject();


}
