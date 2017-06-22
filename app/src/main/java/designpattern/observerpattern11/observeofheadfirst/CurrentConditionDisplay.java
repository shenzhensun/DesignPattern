package designpattern.observerpattern11.observeofheadfirst;

/**
 * Created by JohnSun on 2016/3/18.
 */
public class CurrentConditionDisplay implements MyObserver ,DisplayElement {
   private float temperature;
    private float humidity ;
    private float presure;
    private  WearherData wearherData;

    public CurrentConditionDisplay(WearherData wearherData) {
        this.wearherData = wearherData;
        wearherData.registerMyObserver(this);
    }


    @Override
    public void update(float temp, float humidty, float pressure) {
        this.temperature=temp;
        this.humidity=humidty;
        this.presure=pressure;

    }

    @Override
    public void display() {
        System.out.println("CurrentConditon "+"temperature"+temperature +"F degress");
    }


}
