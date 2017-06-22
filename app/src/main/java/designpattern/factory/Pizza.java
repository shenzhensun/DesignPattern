package designpattern.factory;

import java.util.ArrayList;

/**
 * Created by JohnSun on 2016/3/22.
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings=new ArrayList();


    void preparea() {
        System.out.println("Preaparing  " + name);
        System.out.println("Toss  " + dough);
        System.out.println("Adding  " + sauce);
        for (String s : toppings) {
            System.out.println("Adding  " + s);
        }
    };

      void bake(){
      };

}
