package com.pricetracking.ny.service;

import com.pricetracking.ny.entity.ConfirmationTokenEntity;

public interface ConfirmationTokenService {
  void saveConfirmationToken(ConfirmationTokenEntity confirmationToken);
  void deleteConfirmationToken(Long id);
}
