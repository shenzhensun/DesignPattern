package designpattern.strategy9;

import designpattern.strategy9.mode.People;

/**
 * Created by JohnConna on 2016/1/6.
 */
public class TestStrategy {


    public static void testPeopleSing(){
        People people=new ZhangSan();
        people.appearance();
        people.say();
        people.singSongs();

    }

    private static void alice() {
        People people=new Alice();
        people.appearance();
        people.say();
        people.singSongs();
    }


}
