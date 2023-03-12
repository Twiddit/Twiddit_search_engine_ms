package com.twiddit.searchengine.services;

import com.twiddit.searchengine.entities.User;

public interface UserService {

    User findById(String id);

    User findAll();

    User create(User user);

    User update(User user);
}
