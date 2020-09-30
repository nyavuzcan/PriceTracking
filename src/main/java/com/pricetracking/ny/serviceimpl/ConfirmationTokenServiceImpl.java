package com.pricetracking.ny.serviceimpl;

import com.pricetracking.ny.entity.ConfirmationTokenEntity;
import com.pricetracking.ny.repository.ConfirmationTokenRepository;
import com.pricetracking.ny.service.ConfirmationTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfirmationTokenServiceImpl implements ConfirmationTokenService {

  @Autowired
  ConfirmationTokenRepository confirmationTokenRepository;

  @Override
  public void saveConfirmationToken(ConfirmationTokenEntity confirmationToken) {
    confirmationTokenRepository.save(confirmationToken);
  }

  @Override
  public void deleteConfirmationToken(Long id) {
    confirmationTokenRepository.deleteById(id);
  }


}
