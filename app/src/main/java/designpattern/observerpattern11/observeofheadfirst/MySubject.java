package designpattern.observerpattern11.observeofheadfirst;

/**
 * Created by JohnSun on 2016/3/18.
 */
public interface MySubject {
  public void  registerMyObserver(MyObserver myObserver);
    void removeMyObserver(MyObserver myObserver);
    void notifyMyObservers();
}
