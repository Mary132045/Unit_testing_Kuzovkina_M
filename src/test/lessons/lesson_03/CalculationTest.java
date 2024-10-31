package lessons.lesson_03;

import main.java.lessons.lesson_03.Calculator;
import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;



public class CalculationTest {

    private final InputStream ORIGINAL_IN = System.in;
    private final PrintStream ORIGINAL_OUT = System.out;
    private ByteArrayInputStream TEST_IN;
    private ByteArrayOutputStream TEST_OUT;

    @BeforeEach
    void setUpStreams() {
        TEST_OUT = new ByteArrayOutputStream();
        System.setOut(new PrintStream(TEST_OUT));
    }

    @AfterEach
    void restoreStreams() {
        System.setIn(ORIGINAL_IN);
        System.setOut(ORIGINAL_OUT);
    }

    private void provideInput(String data) {
        TEST_IN = new ByteArrayInputStream(data.getBytes());
        System.setIn(TEST_IN);
    }

    private String getOutput() {
        return TEST_OUT.toString();
    }


    @Test
    void additionExpressionEvaluation() {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2, 6, '+')).isEqualTo(8);
    }

    @Test
    void subtractionExpressionEvaluation() {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2, 2, '-')).isEqualTo(0);
    }

    @Test
    void multiplicationExpressionEvaluation() {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2, 7, '*')).isEqualTo(14);
    }

    @Test
    void divisionExpressionEvaluation() {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(100, 90, '/')).isEqualTo(1);
    }

    @Test
    void expectedIllegalStateExceptionOnInvalidOperatorSymbol() {
        Calculator calculator = new Calculator();
        assertThatThrownBy(() ->
                calculator.calculation(8, 4, '_'))
                .isInstanceOf(IllegalStateException.class);
    }

    /*
    @Test
    void getOperandCompletesCorrectlyWithNumbers() {
        String testedValue = "9"; // Значение для тестов
        ByteArrayInputStream in = new ByteArrayInputStream(testedValue.getBytes());
        InputStream inputStream = System.in; // Сохраняем ссылку на ввод с клавиатуры
        System.setIn(in); // Подменяем ввод

        Calculator.getOperand(); // Вызываем метод

        System.out.println(testedValue); // Для наглядности вывода
        System.setIn(inputStream); // Подменяем обратно
    }

    @Test
    void getOperandCompletesCorrectlyWithNotNumbers() {
        String testedValue = "k";
        ByteArrayInputStream in = new
                ByteArrayInputStream(testedValue.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        InputStream inputStream = System.in;
        System.setIn(in);
        System.setOut(new PrintStream(out));
        assertThatThrownBy(() -> Calculator.getOperand())
                .isInstanceOf(IllegalStateException.class).describedAs("Ошибка в вводимых данных");
                        System.setIn(inputStream);
        System.setOut(null);
    }
    */

    @Test
    @Disabled
    void getOperandCompletesCorrectlyWithNumbers() {
        provideInput("9\n");
        int operand = Calculator.getOperand();
        assertThat(operand).isEqualTo(9);
    }

    @Test
    @Disabled
    void getOperandCompletesCorrectlyWithNotNumbers() {
        provideInput("k\n");
        assertThatThrownBy(Calculator::getOperand)
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("Ошибка в вводимых данных");
    }

    @Test
    void computeAreaCircle() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(314.1592653589793, calculator.computeAreaCircle(10), "Should return right circle area");
    }
}
