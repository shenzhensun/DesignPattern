package designpattern.state20;

/**
 * Created by JohnSun on 2016/5/11.
 */
public class Context {
    public State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


    public void method(){

        if (getState().getValue().equals("state1")){

           state.method1();
        }else if(getState().getValue().equals("state2"))
        {
           state.method2();

        }

    }
}
