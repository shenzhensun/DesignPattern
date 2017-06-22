package designpattern.observerpattern11.observeusesystem;

import java.util.Observable;
import java.util.Observer;

import designpattern.observerpattern11.observeofheadfirst.DisplayElement;

/**
 * Created by JohnSun on 2016/3/19.
 *
 * 使用系统的 不需要管理注册与删除了
 *
 *
 */
public class ScurrentConditionDisplay implements Observer,DisplayElement {
    Observable observable;
    private float temperature;
    private float humitdity;

    public ScurrentConditionDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("show");
    }



    @Override
    public void update(Observable observable, Object data) {
        if ( observable instanceof SWeatherData){
            SWeatherData sWeatherData= (SWeatherData) observable;
            this.temperature=sWeatherData.getTemperature();
            this.humitdity=sWeatherData.getHumidity();
        }
    }
}
