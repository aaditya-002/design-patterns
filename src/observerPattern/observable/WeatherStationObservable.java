package observerPattern.observable;

import observerPattern.observer.DisplayObserver;

public interface WeatherStationObservable {
    public void add(DisplayObserver displayObserver);
    public void remove(DisplayObserver displayObserver);
    public void notifyAllObservers();
    public void setData(long temp);
}
