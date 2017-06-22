package designpattern.bridge09;

import designpattern.LogUtils;

/**
 * Created by JohnSun on 2016/2/22.
 */
public class SourceSub1 implements Sourceable {
    @Override
    public void method() {
        LogUtils.log("");
    }
}
