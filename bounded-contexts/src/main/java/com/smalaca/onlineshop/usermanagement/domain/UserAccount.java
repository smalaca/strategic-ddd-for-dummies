package com.smalaca.onlineshop.usermanagement.domain;

import jakarta.persistence.Table;

import java.util.UUID;

@Table(name = "USERS")
public class UserAccount {
    private UUID userId;
    private String login;
    private String password;
}
