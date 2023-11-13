package com.smalaca.online.domain;

import jakarta.persistence.Table;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Table(name = "USERS")
public class UserAccount {
    private UUID userId;
    private List<UserRole> userRoles;
    private String login;
    private String password;
    private Optional<Agreement> agreement;
    private Optional<BankAccount> bankAccount;

    public boolean isRegular() {
        return userRoles.stream().anyMatch(UserRole::isRegular);
    }
}
