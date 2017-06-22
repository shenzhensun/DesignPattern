package designpattern.decorator06;

/**
 * Created by Administrator on 2016/2/17.
 */
public class Decorator implements Sourceable {
    private Sourceable sourceable;

    public Decorator(Sourceable sourceable){
        super();
        this.sourceable =sourceable;
    }
    @Override
    public void method() {
        System.out.println("before decorator!");
        sourceable.method();
        System.out.println("after decorator" );
    }
}
