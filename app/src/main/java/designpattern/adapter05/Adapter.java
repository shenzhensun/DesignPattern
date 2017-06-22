package designpattern.adapter05;

import designpattern.LogUtils;

/**
 * Created by Administrator on 2016/2/17.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        LogUtils.log("this is the targetable method");
    }
}
