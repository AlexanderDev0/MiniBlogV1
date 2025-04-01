package com.descomplica.FrameBlog.controllers;

import com.descomplica.FrameBlog.models.Comment;
import com.descomplica.FrameBlog.services.CommentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/comments")
public class CommentController {


    private final CommentService commentService;

    public CommentController(CommentService commentService) {

        this.commentService = commentService;
    }

    @PostMapping(path = "/save")
    private @ResponseBody Comment save(@RequestBody Comment comment) {

        return commentService.send(comment);
    }

}