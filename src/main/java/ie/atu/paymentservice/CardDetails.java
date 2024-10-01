package ie.atu.paymentservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardDetails {
    private String name;
    private String userName;
    private Integer cardNumber;
    private Integer securityNumber;
}
