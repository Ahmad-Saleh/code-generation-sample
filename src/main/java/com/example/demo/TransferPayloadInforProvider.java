package com.example.demo;

public class TransferPayloadInforProvider implements PayloadInfoProvider{

    @Override
    public String getAccount(Object payload) {
        if(payload instanceof Transfer) {
            return ((Transfer) payload).getFromAccountNumber();
        }
        return "";
    }

    @Override
    public String getAmountInDefaultCurrency(Object payload) {
        if(payload instanceof Transfer) {
            return ((Transfer) payload).getAmount().toPlainString();
        }
        return "";
    }
}
