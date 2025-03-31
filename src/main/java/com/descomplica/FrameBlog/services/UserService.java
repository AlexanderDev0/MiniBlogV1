package com.descomplica.FrameBlog.services;

import com.descomplica.FrameBlog.models.UserV2;

import java.util.List;

public interface UserServiceV2 {

    UserV2 save(final UserV2 userV2);
    List<UserV2> getAll();
    UserV2 get(final Long id);
    UserV2 update(final Long id, final UserV2 userV2);
    void delete(final Long id);
}