package com.smalaca.onlineshop.payments.domain;

import jakarta.persistence.Table;

import java.util.List;
import java.util.UUID;

@Table(name = "PAYMENTS")
public class Payment {
    private UUID paymentId;
    private List<Product> products;
    private Receiver receiver;
    private Payer payer;

    public void pay() {

    }
}
