package designpattern.observerpattern11.observeusesystem;

import java.util.Observable;

/**
 * Created by JohnSun on 2016/3/19.
 */
public class SWeatherData  extends Observable{

    private float temperature;
    private float humidity;
    private float pressure;

   public SWeatherData(){}


   public void measurementsChanged(){
       setChanged();
       notifyObservers();
   }





    public void setMeasurements (float temperature ,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();

    }
    // 拉数据


    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
