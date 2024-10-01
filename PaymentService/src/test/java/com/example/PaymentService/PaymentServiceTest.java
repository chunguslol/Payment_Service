package com.example.PaymentService;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PaymentServiceTest {

    private final PaymentService paymentService = new PaymentService();

    @Test
    public void testDebitSuccess() {
        PaymentRequest request = new PaymentRequest();
        request.setCardNumber("1234567812345678");
        request.setCvv("123");
        request.setExpirationDate("12/2025");
        request.setAmount(100.0);

        assertTrue(paymentService.debit(request));
    }

    @Test
    public void testDebitFailure() {
        PaymentRequest request = new PaymentRequest();
        request.setCardNumber("1234567812345678");
        request.setCvv("123");
        request.setExpirationDate("12/2025");
        request.setAmount(-50.0); // Monto negativo

        assertFalse(paymentService.debit(request));
    }
}
