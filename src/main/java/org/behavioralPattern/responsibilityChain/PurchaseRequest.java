package org.behavioralPattern.responsibilityChain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class PurchaseRequest {
    private double amount;

    private int number;

    private String purpose;
}
