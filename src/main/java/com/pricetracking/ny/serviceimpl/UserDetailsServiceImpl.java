package com.pricetracking.ny.serviceimpl;

import com.pricetracking.ny.entity.UserEntity;
import com.pricetracking.ny.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Transactional
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
  private UserRepository userRepository;

  public UserDetailsServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    UserEntity userEntity = userRepository.findByEmail(email);
    if (Objects.isNull(userEntity)) return null;

    return new org.springframework.security.core.userdetails.User(
        userEntity.getEmail(),
        userEntity.getPassword(),
        getAuthorities(userEntity));

  }
  private Set<GrantedAuthority> getAuthorities(UserEntity user) {
    Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();

      GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("user");
      authorities.add(grantedAuthority);

    return authorities;

  }
}
