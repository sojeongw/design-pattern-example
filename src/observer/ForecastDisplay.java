package observer;

public class ForecastDisplay implements Observer, Display{
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
//        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("ForecastDisplay");
    }

    @Override
    public void update(int temperature) {
        display();
    }
}
