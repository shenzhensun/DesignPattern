package designpattern.adapter05.wrapper;

import designpattern.LogUtils;
import designpattern.adapter05.Source;
import designpattern.adapter05.Targetable;

/**
 * 对象的适配器模式，持有Source
 *
 */
public class Wrapper implements Targetable {

   private Source source;
   public Wrapper (Source source){
      super();
      this.source=source;

  }

    @Override
    public void method1() {
       source.method1();
    }

    @Override
    public void method2() {
        LogUtils.log("对象适配器"+"目标方法");
    }
}
