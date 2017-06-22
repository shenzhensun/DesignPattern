package designpattern.decorator06.headfirst;

/**
 * Created by JohnSun on 2016/3/19.
 */
public class MysoyCoffee extends CondimentDecorator {
    Beverage beverage;

    public MysoyCoffee(Beverage beverage) {
        this.beverage=beverage;

    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return 0.9+beverage.cost();
    }
}
