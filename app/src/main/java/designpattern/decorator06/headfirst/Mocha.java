package designpattern.decorator06.headfirst;

/**
 * Created by JohnSun on 2016/3/19.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return .20+beverage.cost();
    }
}
