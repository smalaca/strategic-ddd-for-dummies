package com.smalaca.onlineshop.domain;

import jakarta.persistence.Table;

import java.util.List;
import java.util.UUID;

@Table(name = "PAYMENTS")
public class Payment {
    private UUID paymentId;
    private List<Product> products;
    private UserAccount from;
    private UserAccount to;

    public void pay() {

    }
}
