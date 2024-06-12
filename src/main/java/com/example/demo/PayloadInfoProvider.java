package com.example.demo;

public interface PayloadInfoProvider {

    String getAccount(Object payload);

    String getAmountInDefaultCurrency(Object payload);

}
