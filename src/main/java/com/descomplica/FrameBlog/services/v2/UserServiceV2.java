package com.descomplica.FrameBlog.services.v2;

import com.descomplica.FrameBlog.models.UserV2;

import java.util.List;

public interface UserServiceV2 {
    UserV2 save (final UserV2 user);

    List<UserV2> getAll();

    UserV2 get(final Long id);
    UserV2 update(final Long id, final UserV2 user);
    void delete(final Long id);
}
