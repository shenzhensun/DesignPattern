package designpattern.command18;

/**
 * Created by JohnSun on 2016/5/11.
 */
public class Invoker {
    private  Command command;

    public Invoker(Command command) {
        this.command = command;
    }

   public void action(){

       command.exe();
   }


}
