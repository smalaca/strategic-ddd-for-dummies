package com.smalaca.onlineshop.__not_yet_in_the_bounded_context;

import jakarta.persistence.Table;

import java.util.UUID;

@Table(name = "USERS")
public class Customer {
    private UUID customerId;
}
