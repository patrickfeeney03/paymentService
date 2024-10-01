package ie.atu.paymentservice;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final String[] valid = {"An Post", "Bank of Ireland", "Revolut", "AIB"};

    public boolean validateCardDetails(CardDetails cardDetails) {
        for (String bankName : valid) {
            if (bankName.equalsIgnoreCase(cardDetails.getName())) {
                return true;
            }
        }
        return false;
    }
}
