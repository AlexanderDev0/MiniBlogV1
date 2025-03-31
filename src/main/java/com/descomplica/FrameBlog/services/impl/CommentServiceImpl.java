package com.descomplica.FrameBlog.services.impl;

import com.descomplica.FrameBlog.models.Comment;
import com.descomplica.FrameBlog.services.CommentService;
import com.descomplica.FrameBlog.services.UserServiceV2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {




    private final UserServiceV2 userServiceV2;

    public CommentServiceImpl(UserServiceV2 userServiceV2) {
        this.userServiceV2 = userServiceV2;
    }

    @Value("${FrameBlog.rabbitmq.exchange}")
    private String exchange;

    @Value("${FrameBlog.rabbitmq.routingkey}")
    private String routingkey;

    @Override
    public Comment send(Comment comment) {
        comment.setUser(userServiceV2.get(comment.getUser().getUserId()));
        return comment;
    }
}