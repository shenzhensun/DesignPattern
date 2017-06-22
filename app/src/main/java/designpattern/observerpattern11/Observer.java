package designpattern.observerpattern11;

/**
 * Created by JohnConna on 2016/1/5.
 * 观察着接口 ，定义一个更新接口，给那些目标发生改变时 被通知的对象
 */

public interface Observer {
 public void update(Subject subject);

 //区别对待观察者
 public abstract void setObserverName(String observerName);
      String getObserverName();



}
