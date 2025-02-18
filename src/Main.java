import observerPattern.observable.WeatherStationObservableImpl;
import observerPattern.observer.DisplayObserver;
import observerPattern.observer.MobileObserverImpl;
import observerPattern.observer.TVObserverImpl;

public class Main {
    public static void main(String[] args) {
        WeatherStationObservableImpl weatherStationObservable = new WeatherStationObservableImpl();
        DisplayObserver tvObserver = new TVObserverImpl(weatherStationObservable);
        DisplayObserver mobileObserver = new MobileObserverImpl(weatherStationObservable);

        weatherStationObservable.setData(50);
    }
}