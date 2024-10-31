package seminars.seminar_03;

import main.java.seminars.seminar_03.MoodAnalyser;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    void testSADMoodAnalysis() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.moodAnalyser("Это грустное сообщение");
        Assertions.assertThat(mood).isEqualTo("SAD");
    }

    @Test
    void testHappyMoodAnalysis() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.moodAnalyser("Это весёлое сообщение");
        Assertions.assertThat(mood).isEqualTo("HAPPY");
    }

    @Test
    void testNormalMoodAnalysis() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.moodAnalyser("Это обычное сообщение");
        Assertions.assertThat(mood).isEqualTo("Фраза не содержит оценку настроения");
    }
}
