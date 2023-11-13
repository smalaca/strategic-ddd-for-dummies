package com.smalaca.online.domain;

public enum UserRole {
    EMPLOYEE, REGULAR;

    boolean isRegular() {
        return REGULAR.equals(this);
    }
}
