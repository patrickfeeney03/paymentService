package ie.atu.paymentservice;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {

    private final String[] valid = {"An Post", "Bank of Ireland", "Revolut", "AIB"};

    public boolean validateCardDetails(CardDetails cardDetails) {
        for (String bankName : valid) {
            if (bankName.equalsIgnoreCase(cardDetails.getName())) {
                System.out.println("Successful transaction with ID: " + UUID.randomUUID()); // Mock transaction
                return true;
            }
        }
        return false;
    }
}
