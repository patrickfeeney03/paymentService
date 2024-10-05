package ie.atu.paymentservice;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/process-payment")
    public ResponseEntity<String> processPayment(@Valid @RequestBody CardDetails cardDetails) {
        if (!paymentService.validateCardDetails(cardDetails)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid card details");
        }
        return ResponseEntity.status(HttpStatus.OK).body("Credit card user name: " + cardDetails.getName());
    }
}
