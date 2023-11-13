package com.smalaca.onlineshop.shop.domain;

import jakarta.persistence.Table;

@Table(name = "PRODUCTS")
public class Product {
    private Category category;
}
