package com.example.demo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ChequesMapper {

    Cheque toCheque(ChequeEntity entity);

    @Mapping(source = "chequeAmount", target = "amount")
    ChequeEntity toChequeEntity(Cheque cheque);

}
