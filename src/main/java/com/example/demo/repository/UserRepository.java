package com.example.demo.repository;

import com.example.demo.entity.*;
import java.util.*;

public interface UserRepository {
    User save(User u);
    Optional<User> findById(Long id);
    Optional<User> findByEmail(String email);
}
