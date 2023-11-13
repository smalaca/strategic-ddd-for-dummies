package com.smalaca.onlineshop.cart.domain;

import com.smalaca.onlineshop.storage.domain.Size;
import jakarta.persistence.Table;

import java.util.List;
import java.util.UUID;

@Table(name = "PRODUCTS")
public class Product {
    private UUID productId;
    private int weight;
    private Size size;
    private String description;
    private List<String> characteristics;
}
