package com.example.PaymentService;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    // Método que simula el procesamiento del pago
    public boolean debit(PaymentRequest paymentRequest) {
        // Lógica para validar la tarjeta y procesar el pago
        // Aquí simplemente simulo un éxito si el monto es positivo
        return paymentRequest.getAmount() > 0;
    }
}
