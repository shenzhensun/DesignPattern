package designpattern.mediator;

/**
 * Created by JohnSun on 2016/5/11.
 */
public class TestMediator {

    public static  void test(){

        Mediator mediator=new MyMediator() ;

        mediator.createMediator();
        mediator.workAll();

    }


}
