package com.twiddit.searchengine.services;

import com.twiddit.searchengine.entities.Comment;
import com.twiddit.searchengine.entities.DisLike;

public interface CommentService {

    Comment findById(String id);

    Comment findAll();

    Comment create(Comment comment);

    Comment update(Comment comment);
}
