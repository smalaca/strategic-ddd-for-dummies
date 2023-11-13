package com.smalaca.onlineshop.application.user;

import com.smalaca.onlineshop.domain.UserRole;

public record UserDto(String login, String password, UserRole userRole) {
}
