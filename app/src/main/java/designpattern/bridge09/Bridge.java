package designpattern.bridge09;

/**
 * Created by JohnSun on 2016/2/22.
 */

public class Bridge {
    private Sourceable sourceable;
    public void method() {
       sourceable.method();
    }

    public Sourceable getSource(){
        return  sourceable;
    }

   public void setSourceable(Sourceable sourceable){
       this.sourceable=sourceable;
   }



}
