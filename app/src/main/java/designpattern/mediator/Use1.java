package designpattern.mediator;


import android.util.Log;

/**
 * Created by JohnSun on 2016/5/11.
 */
public class Use1 extends User {
    public Use1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        Log.d("Use1", "user1 exe");

    }
}
