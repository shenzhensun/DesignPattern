package designpattern.simplefactory01;

/**
 * Created by JohnConna on 2016/1/6.
 */
public class TestSimpleFactory
{
    public static  void testFactory(){

       Api api= UseFactory.createApi(1);
        api.use("Hello World");

    }

}
