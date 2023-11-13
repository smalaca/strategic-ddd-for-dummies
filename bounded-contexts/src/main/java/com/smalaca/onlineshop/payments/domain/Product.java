package com.smalaca.onlineshop.payments.domain;

import jakarta.persistence.Table;

import java.util.UUID;

@Table(name = "PRODUCTS")
public class Product {
    private UUID productId;
    private Price price;
}
