package designpattern.simplefactory01;

/**
 * Created by JohnConna on 2016/1/6.
 */
public class ImApi implements Api{
    @Override
    public void use(String content) {
        System.out.println(content);
    }
}


