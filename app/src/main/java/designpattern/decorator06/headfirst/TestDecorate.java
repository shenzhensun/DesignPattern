package designpattern.decorator06.headfirst;

/**
 * Created by JohnSun on 2016/3/19.
 */
public class TestDecorate {
    public static void  testDecorate(){

        Beverage beverage1=new Expresso() ;
        System.out.println("descreption是"+beverage1.getDescription()+"价格是"+beverage1.cost());
        Beverage beverage2=new HouseBlend();
        System.out.println("descreption是"+beverage2.getDescription()+"价格是"+beverage2.cost());

        beverage1=new Mocha(beverage1);
        System.out.println("descreption是"+beverage1.getDescription()+"价格是"+beverage1.cost());
        beverage1=new MysoyCoffee(beverage1);
        System.out.println("descreption是"+beverage1.getDescription()+"价格是"+beverage1.cost());










    }






}
