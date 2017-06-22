package designpattern.facade08;

import designpattern.LogUtils;

/**
 * Created by JohnSun on 2016/2/22.
 */
public class CPU {

    public void startup(){
        LogUtils.log("cpu satatup");
    }

    public void shutdown(){
        LogUtils.log("cpu shutdown");
    }

}
