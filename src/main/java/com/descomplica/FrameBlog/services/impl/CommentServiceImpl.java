package com.descomplica.FrameBlog.services.impl;

import com.descomplica.FrameBlog.models.Comment;
import com.descomplica.FrameBlog.repositories.CommentRepository;
import com.descomplica.FrameBlog.services.CommentService;
import com.descomplica.FrameBlog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {




    private final UserService userService;

    public CommentServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Value("${FrameBlog.rabbitmq.exchange}")
    private String exchange;

    @Value("${FrameBlog.rabbitmq.routingkey}")
    private String routingkey;

    @Override
    public Comment send(Comment comment) {
        comment.setUser(userService.get(comment.getUser().getUserId()));
        return comment;
    }
}