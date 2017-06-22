package designpattern.interpreter23;

import designpattern.state20.Context;

/**
 * Created by JohnSun on 2016/5/11.
 */
public class TestInterPreter {

    /**
     * 解释器模式是我们暂时的最后一讲，
     * 一般主要应用在OOP开发中的编译器的开发中
     */



    public static void test(){

        // 计算9+2-8的值

        int result = new Minus().interpret((new MyContext(new Plus()
                .interpret(new MyContext(9, 2)), 8)));
        System.out.println(result);



    }
}
