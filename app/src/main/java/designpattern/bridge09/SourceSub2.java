package designpattern.bridge09;

import designpattern.LogUtils;

/**
 * Created by JohnSun on 2016/2/22.
 */
public class SourceSub2 implements Sourceable {
    @Override
    public void method() {
        LogUtils.log("这是第二个实现");
    }
}
