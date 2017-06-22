package designpattern.strategy9;

import designpattern.strategy9.mode.People;
import designpattern.strategy9.singstragy.SingForeignSongs;

/**
 * Created by JohnConna on 2016/1/6.
 */
public class Alice extends People {

    public Alice(){
        super();
        super.setStrategy(new SingForeignSongs());
    }

    public void say() {
        System.out.println("speak English");
    }
   public void appearance(){
         System.out.println("黄头发， 蓝眼睛");

    }

}
