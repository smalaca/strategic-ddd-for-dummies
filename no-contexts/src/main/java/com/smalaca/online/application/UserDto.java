package com.smalaca.online.application;

import com.smalaca.online.domain.UserRole;

public record UserDto(String login, String password, UserRole userRole) {
}
