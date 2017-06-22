package designpattern.Proxy07;

import android.util.Log;

import designpattern.LogUtils;
import designpattern.adapter05.*;

/**
 * Created by Administrator on 2016/2/17.
 */
public class Proxy implements Sourceable {
    private Source source;
    public Proxy(){
        super();
        this.source=new Source();
        
    }


    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void after() {
        LogUtils.log("after");
    }

    private void before() {
        LogUtils.log("before");

    }
}
