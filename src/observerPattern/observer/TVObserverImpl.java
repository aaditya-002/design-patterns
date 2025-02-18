package observerPattern.observer;

import observerPattern.observable.WeatherStationObservable;
import observerPattern.observable.WeatherStationObservableImpl;

public class TVObserverImpl implements DisplayObserver{
    WeatherStationObservableImpl weatherStationObservable;

    public TVObserverImpl(WeatherStationObservableImpl weatherStationObservable){
        this.weatherStationObservable = weatherStationObservable;
        weatherStationObservable.add(this);
    }
    public void update(){
        System.out.println(weatherStationObservable.temp);
    }
}
