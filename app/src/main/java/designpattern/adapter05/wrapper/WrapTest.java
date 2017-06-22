package designpattern.adapter05.wrapper;

import designpattern.adapter05.Source;
import designpattern.adapter05.Targetable;

/**
 * Created by Administrator on 2016/2/17.
 */
public class WrapTest {
    public static  void test (){

        Source source= new Source();
        Targetable targetable=new Wrapper(source);
        targetable.method1();
        targetable.method2();
    }


}
