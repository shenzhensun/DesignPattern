package designpattern.decorator06.headfirst;

/**
 * Created by JohnSun on 2016/3/19.
 *
 * 浓缩咖啡
 */
public class Expresso extends Beverage {

    public Expresso(){
        description="浓缩咖啡";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
