package com.smalaca.onlineshop.shop.domain;

import jakarta.persistence.Table;

import java.util.UUID;

@Table(name = "PRODUCTS")
public class Product {
    private UUID productId;
    private Category category;
}
