package designpattern.visitor21;

/**
 * Created by JohnSun on 2016/5/11.
 */
public class MySubject implements Subject {

    @Override
    public void accept(Visitor visitor) {
          visitor.visitor(this);
    }

    @Override
    public String getSubject() {
          return  "love";
    }
}
