package main.java.seminars.seminar_03;

/*
Примените подход TDD для создания нового класса MoodAnalyser, который оценивает настроение
выраженное во фразах.
*/

public class MoodAnalyser {

    public String moodAnalyser(String message) {
        if (message.toLowerCase().contains("грустное")) {
            return "SAD";
        } else if (message.toLowerCase().contains("весёлое")){
            return "HAPPY";
        } else {
            return "Фраза не содержит оценку настроения";
        }
    }
}
