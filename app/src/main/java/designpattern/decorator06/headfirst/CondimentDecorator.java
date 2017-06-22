package designpattern.decorator06.headfirst;

/**
 * Created by JohnSun on 2016/3/19.
 *
 * 调料
 */
public abstract class CondimentDecorator extends Beverage {

    //所有的调料装饰着都必须实现
    @Override
    public  abstract  String getDescription();



}
