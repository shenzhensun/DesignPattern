package designpattern.command18;

/**
 * Created by JohnSun on 2016/5/11.
 */
public class TestCommand {

    public static void test(){
        Reciver reciver=new Reciver();
        Command command=new MyCommand(reciver);

        Invoker invoker=new Invoker(command);

        invoker.action();


    }


}
