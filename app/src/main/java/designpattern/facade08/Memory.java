package designpattern.facade08;

import designpattern.LogUtils;

/**
 * Created by JohnSun on 2016/2/22.
 */
public class Memory {
    public void startUp(){
        LogUtils.log("memory startup");
    }



    public void shutdown(){
        LogUtils.log("memory shutdown");

    }

}
