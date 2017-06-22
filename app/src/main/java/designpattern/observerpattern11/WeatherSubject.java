package designpattern.observerpattern11;

/**
 *
 * Created by JohnConna on 2016/1/5.
 *
 * 具体的目标对象 ，负责吧相关状态存入到相应的观察者对象中
 */
public class WeatherSubject extends Subject {
    //目标对象的状态
    //下雪 晴天
    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        this.notifyObservers();//状态发生改变，通知
    }

    @Override
    protected void notifyObservers() {
        for(Observer observer :observers){
            //规则是：
            //黄明的女朋友需要下雨
           // 黄明的老妈需要下雨或下雪
            //晴天则不处理
            if ("下雨".equals(this.getWeatherContent())){
                if ("黄明的女朋友".equals(observer.getObserverName()))
                {
                 observer.update(this);

                }

                if ("黄明的老妈".equals(observer.getObserverName()))
                {
                    observer.update(this);
                }
            }
            //下雪
            if("下雪".equals(observer.getObserverName())) {

                if ("黄明的老妈".equals(observer.getObserverName())) {
                    observer.update(this);

                }
            }

        }



        }



    }

