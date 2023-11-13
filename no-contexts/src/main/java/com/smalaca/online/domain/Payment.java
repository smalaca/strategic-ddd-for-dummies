package com.smalaca.online.domain;

import jakarta.persistence.Table;

import java.util.List;
import java.util.UUID;

@Table(name = "PAYMENTS")
public class Payment {
    private UUID paymentId;
    private List<Product> products;
    private UserAccount customer;
    private BankAccount onlineShop;

    public void pay() {

    }
}
