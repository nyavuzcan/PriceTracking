package com.pricetracking.ny.serviceimpl;

import com.pricetracking.ny.entity.ConfirmationTokenEntity;
import com.pricetracking.ny.entity.UserEntity;
import com.pricetracking.ny.repository.UserRepository;
import com.pricetracking.ny.service.ConfirmationTokenService;
import com.pricetracking.ny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service
public class UserServiceImpl  implements UserService {
  @Autowired
  UserRepository userRepository;
  @Autowired
  ConfirmationTokenService confirmationTokenService;
  @Override
  public UserEntity findUserByEmail(String email) {
    return userRepository.findByEmail(email);
  }

  @Override
  public void saveNewUser(UserEntity userEntity) {
    final String encryptedPassword = DigestUtils.md5DigestAsHex(userEntity.getPassword().getBytes());
    userEntity.setPassword(encryptedPassword);
    final UserEntity createdUser = userRepository.save(userEntity);

    final ConfirmationTokenEntity confirmationToken = new ConfirmationTokenEntity(userEntity);
    confirmationTokenService.saveConfirmationToken(confirmationToken);
  }

  @Override
  public void confirmUser(ConfirmationTokenEntity confirmationToken) {
    final UserEntity userEntity = confirmationToken.getUser();

  }


}
