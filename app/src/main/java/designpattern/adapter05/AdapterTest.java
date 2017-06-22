package designpattern.adapter05;

import android.util.Log;

/**
 * Created by Administrator on 2016/2/17.
 */
public class AdapterTest {
    public static void testAdapter(){
        Targetable targetable=new Adapter();
        targetable.method1();
        targetable.method2();

    }


}
