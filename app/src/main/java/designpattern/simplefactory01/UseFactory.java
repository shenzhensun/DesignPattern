package designpattern.simplefactory01;

/**
 * Created by JohnConna on 2016/1/6.
 */
public class UseFactory
{
    public static Api createApi(int condition){
        Api api=null;
        if (condition==1){
            api=new ImApi();
            return api;
        }
        else {
            return api;
        }
    }
}
