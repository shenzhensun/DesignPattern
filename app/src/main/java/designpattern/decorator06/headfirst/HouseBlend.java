package designpattern.decorator06.headfirst;

/**
 * Created by JohnSun on 2016/3/19.
 */

/**
 * 另一种咖啡
 */
public class HouseBlend extends Beverage{

    public HouseBlend(){
        description="这是新的咖啡";
    }
    @Override
    public double cost() {
        return 0;
    }
}
