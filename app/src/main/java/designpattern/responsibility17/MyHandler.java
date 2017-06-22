package designpattern.responsibility17;

/**
 * Created by JohnSun on 2016/5/11.
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;
    public MyHandler (String name){
        this.name =name;
    }

    @Override
    public void operator() {
        System.out.println(name+"deal!");
        if (getHandler()!=null){

            getHandler().operator();
        }


    }
}
