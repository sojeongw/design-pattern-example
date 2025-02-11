package observer;

public class CurrentConditionDisplay implements Observer, Display{
    private int temperature;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temperature = " + temperature);
    }

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        display();
    }
}
