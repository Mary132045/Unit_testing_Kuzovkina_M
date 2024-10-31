package seminars.seminar_04.weather;


import main.java.seminars.seminar_04.weather.WeatherReporter;
import main.java.seminars.seminar_04.weather.WeatherService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class WeatherReporterTest {

    // Проверяем, что отчёт содержит ожидаемую информацию о температуре

    @Test
    public void testWeatherReporter() {

        // Создаём мок для WeatherReporter
        WeatherService mockWeatherService = mock(WeatherService.class);

        // Определяем поведение мока. Когда метод getCurrentTemperature() будет вызван, то он вернёт 30 градусов
        when(mockWeatherService.getCurrentTemperature()).thenReturn(30);

        // Создаём объект класса WeatherReporter и передаём ему созданный мок в конструктор
        WeatherReporter weatherReporter = new WeatherReporter(mockWeatherService);

        // Вызываем метод generateReport()
        String report = weatherReporter.generateReport();

        // Проверяем, что отчёт содержит информацию о температуре
        assertEquals("Текущая температура: 30 градусов.", report);

    }
}