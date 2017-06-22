package designpattern.observerpattern11.observeofheadfirst;

import java.util.ArrayList;

/**
 * Created by JohnSun on 2016/3/18.
 */
public class WearherData implements MySubject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

   WearherData(){
       observers =new ArrayList();
   }


    @Override
    public void registerMyObserver(MyObserver myObserver) {
        observers.add(myObserver);
    }

    @Override
    public void removeMyObserver(MyObserver myObserver) {
     int i=observers.indexOf(myObserver);
        if (i>0){
            observers.remove(i);

        }
    }

    @Override
    public void notifyMyObservers() {
           for (int i=0;i<observers.size();i++){
               MyObserver myObserver= (MyObserver) observers.get(i);
               myObserver.update(temperature,humidity,pressure);
           }
    }

    private  void measureChanged(){
        notifyMyObservers();

    }

    public void setMeasurements (float temperature ,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measureChanged();
    }

}
