package com.pricetracking.ny.serviceimpl;

import com.pricetracking.ny.entity.UserEntity;
import com.pricetracking.ny.repository.UserRepository;
import com.pricetracking.ny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {
  @Autowired
  UserRepository userRepository;
  @Override
  public UserEntity findUserByEmail(String email) {
    return userRepository.findByEmail(email);
  }

  @Override
  public void saveNewUser(UserEntity userEntity) {
      userRepository.save(userEntity);
  }
}
