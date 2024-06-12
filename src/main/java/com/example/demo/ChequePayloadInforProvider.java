package com.example.demo;

public class ChequePayloadInforProvider implements PayloadInfoProvider{

    @Override
    public String getAccount(Object payload) {
        if(payload instanceof Cheque) {
            return ((Cheque)payload).getPayeeAccountNumber();
        }
        return "";
    }

    @Override
    public String getAmountInDefaultCurrency(Object payload) {
        if(payload instanceof Cheque) {
            return ((Cheque) payload).getChequeAmount().toPlainString();
        }
        return "";
    }
}
