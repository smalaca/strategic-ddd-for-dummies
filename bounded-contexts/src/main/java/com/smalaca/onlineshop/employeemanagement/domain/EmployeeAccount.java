package com.smalaca.onlineshop.employeemanagement.domain;

import jakarta.persistence.Table;

import java.util.UUID;

@Table(name = "USERS")
public class EmployeeAccount {
    private UUID employeeId;
    private String login;
    private String password;
    private Agreement agreement;
}
