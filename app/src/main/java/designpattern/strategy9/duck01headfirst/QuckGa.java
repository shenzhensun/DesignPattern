package designpattern.strategy9.duck01headfirst;

import designpattern.LogUtils;

/**
 * Created by JohnSun on 2016/2/29.
 */
public class QuckGa implements QuackBehavior {
    @Override
    public void quack() {
        LogUtils.log("鸭子再叫");
    }
}
