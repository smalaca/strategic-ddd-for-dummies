package com.smalaca.onlineshop.payments.domain;

import jakarta.persistence.Table;

import java.util.UUID;

@Table(name = "USERS")
public class Customer {
    private UUID customerId;
    private BankAccount bankAccount;
}
