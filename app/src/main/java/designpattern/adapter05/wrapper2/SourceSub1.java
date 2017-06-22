package designpattern.adapter05.wrapper2;

import designpattern.LogUtils;

/**
 * Created by Administrator on 2016/2/17.
 */
public class SourceSub1 extends Wrapper2 {

    @Override
    public void method1(){
        LogUtils.log("SourceSub1"+"方法1");
    }


}
