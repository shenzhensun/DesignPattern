package designpattern.singleinstance02;

/**
 *
 * Created by JohnConna on 2016/1/6.
 * 饿汉模式
 */
public class SingleInstance0 {
     //线程安全的
    private SingleInstance0(){}

    private static SingleInstance0 singleInstance0=new SingleInstance0();

    public SingleInstance0 getInstance(){
        return  singleInstance0;
    }




}
