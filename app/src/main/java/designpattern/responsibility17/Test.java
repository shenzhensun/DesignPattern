package designpattern.responsibility17;

/**
 * Created by JohnSun on 2016/5/11.
 */
public class Test {


    public static void testHandler(){

        MyHandler sun=new MyHandler("sun");
        MyHandler shen=new MyHandler("shen");
        MyHandler zhen=new MyHandler("zhen");
        sun.setHandler(shen);
        shen.setHandler(zhen);
        //持有下家的
        sun.operator();

    }




}
