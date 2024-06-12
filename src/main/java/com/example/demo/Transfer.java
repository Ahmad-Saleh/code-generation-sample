package com.example.demo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Currency;

@Data
public class Transfer {

    @DebitAccount
    private String fromAccountNumber;
    @DebitAmount
    private BigDecimal amount;
    private Currency currency;
    private String toAccountNumber;
    private String notes;
}
