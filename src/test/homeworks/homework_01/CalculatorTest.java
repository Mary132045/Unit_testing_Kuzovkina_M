package homeworks.homework_01;

import main.java.homeworks.homework_01.Task_01.Calculator;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void shouldThrowArithmeticExceptionForNegativePurchase() {
        assertThatThrownBy(() -> calculator.calculateDiscount(-15358.76, 25))
                .isInstanceOf(ArithmeticException.class);
    }

    @Test
    public void shouldThrowArithmeticExceptionForNegativePercentage() {
        assertThatThrownBy(() -> calculator.calculateDiscount(15358.76, -25))
                .isInstanceOf(ArithmeticException.class);
    }

    @Test
    public void shouldThrowArithmeticExceptionForDiscountGreaterThan100() {
        assertThatThrownBy(() -> calculator.calculateDiscount(15358.76, 101))
                .isInstanceOf(ArithmeticException.class);
    }

    @Test
    public void shouldReturnCorrectDiscountedPurchaseAmount() {
        double discountedPurchaseAmount = calculator.calculateDiscount(15358.76, 25);
        assertThat(discountedPurchaseAmount).isEqualTo(11519.07);
    }
}
