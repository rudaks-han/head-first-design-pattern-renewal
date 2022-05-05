package observer.step1;

public class WeatherData {

    public void measurementChanged() {

        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        /*
        currentConditionDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);

        이부분은 바뀔 수 있는 부분으로 캡슐화해야 한다.
        */
    }

    private float getPressure() {
        return 0;
    }

    private float getHumidity() {
        return 0;
    }

    private float getTemperature() {
        return 0;
    }
}
