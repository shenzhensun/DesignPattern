package designpattern.mediator;

/**
 * Created by JohnSun on 2016/5/11.
 */
public abstract class User {

    private Mediator mediator;
    public Mediator getMediator(){

        return mediator;
    };


    public User() {
    }

    public User(Mediator mediator){
        this.mediator=mediator;
    }

    public abstract void work();

}
