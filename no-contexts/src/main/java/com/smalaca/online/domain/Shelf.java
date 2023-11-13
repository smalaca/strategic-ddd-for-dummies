package com.smalaca.online.domain;

import jakarta.persistence.Table;

import java.util.List;
import java.util.UUID;

@Table(name = "SHELVES")
public class Shelf {
    private UUID shelfId;
    private List<Product> products;

    public void add(Product product) {
        products.add(product);
    }
}
