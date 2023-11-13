package com.smalaca.onlineshop.storage.domain;

import jakarta.persistence.Table;

import java.util.List;
import java.util.UUID;

@Table(name = "STORAGES")
public class Storage {
    private UUID storageId;
    private List<Product> products;

    public void add(Product product) {
        products.add(product);
    }
}
