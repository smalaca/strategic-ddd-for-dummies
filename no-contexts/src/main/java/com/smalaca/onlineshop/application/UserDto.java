package com.smalaca.onlineshop.application;

import com.smalaca.onlineshop.domain.UserRole;

public record UserDto(String login, String password, UserRole userRole) {
}
