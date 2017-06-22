package designpattern.observerpattern11;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JohnConna on 2016/1/5.
 * 目标对象 知道观察者 提供注册 删除观察者的接口
 */

public abstract class Subject {
//用来保存
protected List<Observer> observers =new ArrayList<Observer>();

    public  void  attach(Observer observer){
        observers.add(observer);
    }
  /**
   删除指定观察者
   */
   public void detach(Observer observer)
   {
       observers.remove(observer);
   }

    /**1.基本的
     * 通知所有注册的观察者对象，只有子类可以调用受保护的
     */
  /*protected void notifyObservers(){
      for(Observer observer :observers){
         observer.update(this);
      }
  }*/

    /**
     * 2.区别对待观察者
     */
    protected abstract void notifyObservers();

}
