package designpattern.decorator06;

/**
 * Created by Administrator on 2016/2/17.
 */
public class DecoratorTest {

    public static  void main(){

        Sourceable source=new Source();
        Sourceable obj=new Decorator(source);
        obj.method();


    }


}
