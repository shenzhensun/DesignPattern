package designpattern.strategy9.duck01headfirst;

import designpattern.LogUtils;

/**
 * Created by JohnSun on 2016/2/29.
 */
public class FlyWithWIngs implements FlyBehavior {
    @Override
    public void fly() {
        LogUtils.log("我是用翅膀飞的");
    }
}
