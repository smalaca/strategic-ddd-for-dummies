package com.smalaca.online.domain;

public enum UserRole {
    EMPLOYEE, REGULAR, CUSTOMER, SUPPLIER, ONLINE_SHOP;

    boolean isRegular() {
        return REGULAR.equals(this);
    }
}
