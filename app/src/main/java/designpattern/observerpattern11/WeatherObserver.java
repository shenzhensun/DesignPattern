package designpattern.observerpattern11;

/**
 * Created by JohnConna on 2016/1/5.
 * 具体对象实现更新的方法 ，使自身的状态和目标的状态保持一致
 */
public class WeatherObserver implements Observer {



    private String weatherContent;
    private String observerName;
    private String observerRemindthing;

    @Override
    public void update(Subject subject) {
        weatherContent =((WeatherSubject)subject).getWeatherContent();//保持同步
        System.out.println(""+observerName +"收到了"+ weatherContent +observerRemindthing);

    }



    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }



    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public String  getObserverName() {
        return observerName;
    }

    public String getObserverRemindthing() {
        return observerRemindthing;
    }

    public void setObserverRemindthing(String observerRemindthing) {
        this.observerRemindthing = observerRemindthing;
    }
}
