package com.osiki.demo_bank_app_one.service;

import com.osiki.demo_bank_app_one.payload.request.CreditAndDebitRequest;
import com.osiki.demo_bank_app_one.payload.request.EnquiryRequest;
import com.osiki.demo_bank_app_one.payload.request.TransferRequest;
import com.osiki.demo_bank_app_one.payload.response.BankResponse;

public interface UserService {
    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);
    String nameEnquiry(EnquiryRequest enquiryRequest);

    BankResponse creditAccount(CreditAndDebitRequest request);

    BankResponse debitAccount(CreditAndDebitRequest request);

    BankResponse transfer(TransferRequest request);
}
