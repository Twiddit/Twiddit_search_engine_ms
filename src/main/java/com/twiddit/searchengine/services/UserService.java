package com.twiddit.searchengine.services;

import com.twiddit.searchengine.entities.Twiddit;
import com.twiddit.searchengine.entities.User;

import java.util.List;

public interface UserService {

    User findById(String id);

    List<User> findAll();

    User create(User user);

    User update(User user);

     List<User> findByUserNameContaining(String text);
}
