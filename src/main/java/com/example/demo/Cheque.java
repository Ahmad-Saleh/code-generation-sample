package com.example.demo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Currency;

@Data
public class Cheque {

    @DebitAccount
    private String payeeAccountNumber;
    @DebitAmount
    private BigDecimal chequeAmount;
    private Currency currency;
    private String drawerAccountNumber;
    private String notes;
}
