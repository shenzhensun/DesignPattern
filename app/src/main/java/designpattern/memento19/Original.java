package designpattern.memento19;

/**
 * Created by JohnSun on 2016/5/11.
 */
public class Original {


    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Original(String value) {
        this.value = value;
    }

    public Memento createMemento(){
        return new Memento(value);
    }

    //恢复
    public void restoreMemento(Memento memento){
        this.value = memento.getValue();
    }

}
