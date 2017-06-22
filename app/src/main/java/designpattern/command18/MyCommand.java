package designpattern.command18;

/**
 * Created by JohnSun on 2016/5/11.
 */
public class MyCommand implements Command {

    private Reciver reciver;

    public MyCommand(Reciver reciver) {
        this.reciver = reciver;
    }

    @Override
    public void exe() {
      reciver.action();
    }
}
