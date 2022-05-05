#### 옵저버 패턴

Subject 정의
* registerObserver
* removeObserver
* notifyObservers

Observer
* update(float temperature, float humidity, float pressure)

WeatherData
* float temperature
* float humidity
* float pressure
* setMeasurement

WeatherStation
* weatherData 생성
* setMeasurement

