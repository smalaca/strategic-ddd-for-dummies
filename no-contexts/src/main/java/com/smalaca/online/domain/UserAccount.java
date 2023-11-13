package com.smalaca.online.domain;

import jakarta.persistence.Table;

import java.util.Optional;
import java.util.UUID;

@Table(name = "USERS")
public class UserAccount {
    private UUID userId;
    private UserRole userRole;
    private String login;
    private String password;
    private Optional<Agreement> agreement;

    public boolean isRegular() {
        return userRole.isRegular();
    }
}
