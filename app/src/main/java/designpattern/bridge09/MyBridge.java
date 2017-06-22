package designpattern.bridge09;

/**
 * Created by JohnSun on 2016/2/22.
 */
public class MyBridge extends Bridge{
    @Override
    public void method(){
        getSource().method();
    }


}
