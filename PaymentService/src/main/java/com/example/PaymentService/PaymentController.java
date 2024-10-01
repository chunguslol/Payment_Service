package com.example.PaymentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/debit")
    public String debitPayment(@RequestBody PaymentRequest paymentRequest) {
        boolean success = paymentService.debit(paymentRequest);
        return success ? "Pago procesado exitosamente." : "Error en el procesamiento del pago.";
    }
}
