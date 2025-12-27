package com.example.demo.service;

import com.example.demo.entity.*;

public interface UserService {
    User register(User user);
    User findByEmail(String email);
}
