package com.example.demo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Currency;

@Data
public class ChequeEntity {

    private String payeeAccountNumber;
    private BigDecimal amount;
    private Currency currency;
    private String drawerAccountNumber;
    private String notes;
}
