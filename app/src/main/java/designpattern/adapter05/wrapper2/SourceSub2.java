package designpattern.adapter05.wrapper2;

import designpattern.LogUtils;

/**
 * Created by Administrator on 2016/2/17.
 */
public class SourceSub2 extends Wrapper2{

    @Override
    public void method2(){
        LogUtils.log("重写第二个方法");
    };

}
