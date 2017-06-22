package designpattern.strategy9.mode;

/**
 * Created by JohnConna on 2016/1/6.
 */
public abstract class People {


    public People(){}

    public  abstract void say();


    public void appearance(){
    }

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void singSongs(){
        strategy.sing();
    }

}
