package observer.weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temparature;
	private float humidity;
	private WeatherData weatherData;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		this.temparature = temparature;
		this.humidity = humidity;
		display();
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		System.out.println("Current Conditions [temparature=" + temparature + ", humidity=" + humidity +"]");
		
	}
	
}
