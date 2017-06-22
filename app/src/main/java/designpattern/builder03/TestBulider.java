package designpattern.builder03;

/**
 * Created by Administrator on 2016/2/10.
 */

/**
 * 建造者模式可以将很多功能，集中到一个类中，而这个类可以创造出比较复杂的东西，工厂模式关注的是创建单个产品，而建造者模式则关注常见符合对象的多个部分
 */
public class TestBulider {



    public static void main(){
        Bulider bulider=new Bulider();
        bulider.produceMailSender(10);


    }


}
