package designpattern.adapter05.wrapper2;

/**
 * Created by Administrator on 2016/2/17.
 */
public class WrapperTest {

    public void main(){
        Sourceable sourceable1=new SourceSub1();
        Sourceable sourceable2=new SourceSub2();

        sourceable1.method1();
        sourceable1.method2();
        sourceable2.method1();
        sourceable2.method2();


    }

}
