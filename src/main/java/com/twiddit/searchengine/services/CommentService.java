package com.twiddit.searchengine.services;

import com.twiddit.searchengine.entities.Comment;

import java.util.List;

public interface CommentService {

    Comment findById(String id);

    List<Comment> findAll();

    Comment create(Comment comment);

    Comment update(Comment comment);

    List<Comment> findByTextContaining(String text);

}
