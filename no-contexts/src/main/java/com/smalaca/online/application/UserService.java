package com.smalaca.online.application;

import com.smalaca.online.domain.UserAccount;
import com.smalaca.online.domain.UserRepository;

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
