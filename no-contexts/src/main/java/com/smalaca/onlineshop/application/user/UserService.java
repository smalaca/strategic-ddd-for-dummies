package com.smalaca.onlineshop.application.user;

import com.smalaca.onlineshop.domain.UserAccount;
import com.smalaca.onlineshop.domain.UserRepository;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(UserDto dto) {
        UserAccount userAccount = asUserAccount(dto);

        if (userAccount.isRegular() || isCreatedByTheBoss()) {
            userRepository.save(userAccount);
        }
    }

    private boolean isCreatedByTheBoss() {
        return false;
    }

    private UserAccount asUserAccount(UserDto dto) {
        return null;
    }
}
