package com.pricetracking.ny.controller;

import com.pricetracking.ny.dto.UserRequest;
import com.pricetracking.ny.entity.UserEntity;
import com.pricetracking.ny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
  @Autowired
  UserService userService;


  @RequestMapping(value = "/register", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,
      consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity saveRegisterPage(@RequestBody UserRequest userRequest) {
    UserEntity userEntity = new UserEntity();
    userEntity.setEmail(userRequest.getEmail());
    userEntity.setName(userRequest.getName());
    userEntity.setLastname(userRequest.getLastname());
    userEntity.setPassword(DigestUtils.md5DigestAsHex(userRequest.getPassword().getBytes()));

    userService.saveNewUser(userEntity);
    return new ResponseEntity<>("Successfully Saved", HttpStatus.OK);

  }
}
