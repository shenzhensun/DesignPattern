package designpattern.command18;

import android.util.Log;

import com.example.johnsun.designpattern.BuildConfig;

/**
 * Created by JohnSun on 2016/5/11.
 */
public class Reciver {


    public void action(){

     if (BuildConfig.DEBUG) Log.d("Reciver", "command reciver and do action");

    }
}
