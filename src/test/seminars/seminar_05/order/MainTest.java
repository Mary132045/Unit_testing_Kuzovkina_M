package seminars.seminar_05.order;

import main.java.seminars.seminar_05.order.OrderService;
import main.java.seminars.seminar_05.order.PaymentService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    public void testPlaceOrder() {
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);

        boolean result = orderService.placeOrder("order1", 50.0);

        assertTrue(result);
    }
}
