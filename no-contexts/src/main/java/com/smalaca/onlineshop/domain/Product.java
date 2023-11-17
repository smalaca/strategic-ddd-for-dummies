package com.smalaca.onlineshop.domain;

import jakarta.persistence.Table;

import java.util.List;
import java.util.UUID;

@Table(name = "PRODUCTS")
public class Product {
    private UUID productId;
    private boolean isFragile;
    private int weight;
    private Size size;
    private Category category;
    private String description;
    private List<String> characteristics;
    private Price price;
}
