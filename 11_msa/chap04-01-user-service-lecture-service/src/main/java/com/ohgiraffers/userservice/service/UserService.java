package com.ohgiraffers.userservice.service;

import com.ohgiraffers.userservice.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

// security 규약에서 UserDetailsService를 상속받는다.
public interface UserService extends UserDetailsService {
    void registUser(UserDTO userDTO);
}
