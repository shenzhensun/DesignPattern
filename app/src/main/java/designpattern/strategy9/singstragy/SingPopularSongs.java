package designpattern.strategy9.singstragy;

import designpattern.strategy9.mode.Strategy;

/**
 * Created by JohnConna on 2016/1/6.
 */
public class SingPopularSongs implements Strategy {
    @Override
    public void sing() {
        System.out.println("唱流行歌曲");
    }
}
