package com.pricetracking.ny.service;

import com.pricetracking.ny.entity.UserEntity;

public interface UserService {
UserEntity findUserByEmail(String email);

void saveNewUser(UserEntity userEntity);
}
