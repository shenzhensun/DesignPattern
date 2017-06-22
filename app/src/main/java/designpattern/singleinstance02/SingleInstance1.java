package designpattern.singleinstance02;

/**
 * Created by JohnConna on 2016/1/6.
 */
// 懒汉模式
public class SingleInstance1 {
    private SingleInstance1 (){

    }
    private static SingleInstance1 singleInstance1;

    public SingleInstance1 getInstance(){
        if (singleInstance1==null){
            singleInstance1=new SingleInstance1();
            return singleInstance1;
         }
     else {
            return singleInstance1;
        }
    }



}
