package designpattern.observerpattern11;

/**
 * Created by JohnConna on 2016/1/5.
 */
public class UseObserverPattern {
 // 1.
    public static void testObserver(){
        //1.创建目标
        WeatherSubject weatherSubject=new WeatherSubject();

        //2.创建观察者
        WeatherObserver girl=new WeatherObserver();
        girl.setObserverName("小美");
        girl.setObserverRemindthing("是我们的第一次约会，不见不散哦");

        WeatherObserver mother=new WeatherObserver();
        mother.setObserverName("老妈");
        mother.setObserverRemindthing("是一个购物的好日子，去仆人吧");

        //3.注册观察者
        weatherSubject.attach(girl);
        weatherSubject.attach(mother);

        //4.目标发布信息
        weatherSubject.setWeatherContent("明天天气晴朗，风和日丽");
        //统一通知。各自处理 一个对象对应不同的观察者


    }


    public static void  distinguishObserver(){
        //2区别对待观察者，同上
        WeatherSubject weatherSubject=new WeatherSubject();


        WeatherObserver girl=new WeatherObserver();
        girl.setObserverName("黄明的女朋友");
        girl.setObserverRemindthing("下雨了，安静的呆在家里吧");

        WeatherObserver mum=new  WeatherObserver();
        mum.setObserverName("黄明的老妈");
        mum.setObserverRemindthing("不管下雨，还是下雪我都不出门了");

        weatherSubject.attach(girl);
        weatherSubject.attach(mum);

        weatherSubject.setWeatherContent("下雨");

    }

}
