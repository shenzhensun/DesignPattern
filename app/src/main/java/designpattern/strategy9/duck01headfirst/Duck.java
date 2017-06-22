package designpattern.strategy9.duck01headfirst;

import designpattern.LogUtils;

/**
 * Created by JohnSun on 2016/2/29.
 */
public abstract class Duck {

   protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;



    public void performFly(){

        flyBehavior.fly();
    };

    public void performQuack(){

       quackBehavior.quack();
    };

    public  abstract void   display();

    public  void  swim(){
        LogUtils.log("鸭子会游泳");
    };



}
