package designpattern.responsibility17;

/**
 * Created by JohnSun on 2016/5/11.
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
