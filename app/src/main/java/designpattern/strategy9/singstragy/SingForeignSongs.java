package designpattern.strategy9.singstragy;

import designpattern.strategy9.mode.Strategy;

/**
 * Created by JohnConna on 2016/1/6.
 */
public class SingForeignSongs implements Strategy {
    @Override
    public void sing() {
        System.out.println("sing Foreign Songs");
    }
}
