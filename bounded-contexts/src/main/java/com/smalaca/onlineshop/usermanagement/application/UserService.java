package com.smalaca.onlineshop.usermanagement.application;

import com.smalaca.onlineshop.usermanagement.domain.UserAccount;
import com.smalaca.onlineshop.usermanagement.domain.UserRepository;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(UserDto dto) {
        UserAccount userAccount = asUserAccount(dto);

        userRepository.save(userAccount);
    }

    private UserAccount asUserAccount(UserDto dto) {
        return null;
    }
}
