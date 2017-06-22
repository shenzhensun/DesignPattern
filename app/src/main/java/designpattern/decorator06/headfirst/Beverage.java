package designpattern.decorator06.headfirst;

/**
 * Created by JohnSun on 2016/3/19.
 */
public abstract class Beverage {
    String description= "Unknow Beverage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
