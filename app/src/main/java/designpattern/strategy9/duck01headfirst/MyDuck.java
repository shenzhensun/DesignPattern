package designpattern.strategy9.duck01headfirst;

import designpattern.LogUtils;

/**
 * Created by JohnSun on 2016/2/29.
 */
public class MyDuck extends Duck {

    public MyDuck(){
        flyBehavior=new FlyWithWIngs();
        quackBehavior=new QuckGa();
    }


    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior=flyBehavior;
    }


    @Override
    public void display() {

        LogUtils.log("我的鸭子最好看");
    }
}
