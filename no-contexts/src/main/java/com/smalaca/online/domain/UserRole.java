package com.smalaca.online.domain;

public enum UserRole {
    EMPLOYEE, REGULAR, CUSTOMER;

    boolean isRegular() {
        return REGULAR.equals(this);
    }
}
