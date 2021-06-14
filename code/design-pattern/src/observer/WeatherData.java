package observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private ArrayList observers;
	private float temparature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for(int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temparature, humidity, pressure);
		}
	}
	
	// 옵저버들한테 알리기
	public void measurementsChanged() {
		notifyObservers();
	}
	
	// 기상스테이션 데이터 가져오기
	public void setMeasurements(float temparature, float humidity, float pressure) {
		this.temparature = temparature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
}
