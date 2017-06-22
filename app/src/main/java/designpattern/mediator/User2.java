package designpattern.mediator;

import android.util.Log;

/**
 * Created by JohnSun on 2016/5/11.
 */
public class User2 extends User {
    public User2(Mediator mediator) {

        super(mediator);
    }

    @Override
    public void work() {
        Log.d("User2", "user2 exe");
    }
}
