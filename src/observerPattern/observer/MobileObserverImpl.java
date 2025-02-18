package observerPattern.observer;

import observerPattern.observable.WeatherStationObservableImpl;

public class MobileObserverImpl implements DisplayObserver{
    WeatherStationObservableImpl weatherStationObservable;
    public MobileObserverImpl(WeatherStationObservableImpl weatherStationObservable){
        this.weatherStationObservable = weatherStationObservable;
        weatherStationObservable.add(this);
    }
    public void update(){
        System.out.println(weatherStationObservable.temp);
    }
}
