package observerPattern.observable;

import observerPattern.observer.DisplayObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservableImpl implements WeatherStationObservable{
    List<DisplayObserver> observerList;
    public long temp;

    public void add(DisplayObserver displayObserver){
        this.observerList.add(displayObserver);
    }

    public void remove(DisplayObserver displayObserver){
        this.observerList.remove(displayObserver);
    }

    public void notifyAllObservers(){
        for(DisplayObserver observer: observerList){
            observer.update();
        }
    }

    public void setData(long temp){
        this.setTemp(temp);
        notifyAllObservers();
    }

    public void setTemp(long temp){
        this.temp = temp;
    }

    public WeatherStationObservableImpl(){
        this.observerList = new ArrayList<>();
    }
}
