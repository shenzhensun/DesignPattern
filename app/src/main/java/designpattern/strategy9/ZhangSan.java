package designpattern.strategy9;

import designpattern.strategy9.mode.People;
import designpattern.strategy9.singstragy.SingPopularSongs;

/**
 * Created by JohnConna on 2016/1/6.
 */
public class ZhangSan extends People {

    public  ZhangSan(){
        super();

        super.setStrategy(new SingPopularSongs());

    }

    @Override
    public void say() {
        System.out.println("说汉语");
    }

    public void appearance(){
        System.out.println("黄皮肤，亚洲人");
    }


}
