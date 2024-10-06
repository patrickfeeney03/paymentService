package ie.atu.paymentservice;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardDetails {
    @NotBlank
    private String name;
    @NotBlank
    private String userName;
    @Digits(integer = 3, fraction = 0)
    private Integer cardNumber;
    @Digits(integer = 3, fraction = 0)
    private Integer securityNumber;
}
