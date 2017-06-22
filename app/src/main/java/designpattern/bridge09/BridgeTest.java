package designpattern.bridge09;

/**
 * Created by JohnSun on 2016/2/22.
 */
public class BridgeTest {


    public static void main (){
        Bridge bridge=new MyBridge();

        Sourceable sourceable1=new SourceSub1();
        bridge.setSourceable(sourceable1);
        bridge.method();


        Sourceable sourceable2=new SourceSub2();
        bridge.setSourceable(sourceable2);
        bridge.method();


    }

}
