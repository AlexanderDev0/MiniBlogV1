package com.descomplica.FrameBlog.services;

import com.descomplica.FrameBlog.models.User;

import java.util.List;

public interface UserService {
    User save(User user);

    User get(Long id);

    List<User> getAll();

    User update(Long id, User user);

    void delete(Long id);
}
