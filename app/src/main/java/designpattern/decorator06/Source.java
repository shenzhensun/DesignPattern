package designpattern.decorator06;

import designpattern.LogUtils;

/**
 * Created by Administrator on 2016/2/17.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        LogUtils.log("装饰模式deSource");
    }
}
