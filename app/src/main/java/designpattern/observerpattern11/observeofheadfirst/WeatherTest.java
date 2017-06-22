package designpattern.observerpattern11.observeofheadfirst;

/**
 * Created by JohnSun on 2016/3/18.
 */
public class WeatherTest {

    public void testWeather(){
        WearherData wearherData=new WearherData();
        CurrentConditionDisplay currentConditionDisplay= new CurrentConditionDisplay(wearherData);
        wearherData.setMeasurements(80,65,30.4f);


    }



}
