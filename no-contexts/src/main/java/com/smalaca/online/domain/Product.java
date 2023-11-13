package com.smalaca.online.domain;

import jakarta.persistence.Table;

import java.util.UUID;

@Table(name = "PRODUCTS")
public class Product {
    private UUID productId;
    private boolean isFragile;
    private int weight;
    private Size size;
    private Category category;
}
