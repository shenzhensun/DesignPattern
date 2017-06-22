package designpattern.adapter05;

/**
 * Created by Administrator on 2016/2/17.
 */

import designpattern.LogUtils;

/**
 * 适配器模式,将某个类的接口转换为客户端期望的另一个接口表示，
 * 目的是消除由于接口不匹配所造成的类的兼容性，
 */
public class Source {
    public void method1(){
        LogUtils.log("this is origin method");
    }

}
