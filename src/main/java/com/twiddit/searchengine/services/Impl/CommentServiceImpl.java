package com.twiddit.searchengine.services.Impl;

import com.twiddit.searchengine.Repository.CommentRepository;
import com.twiddit.searchengine.entities.Comment;
import com.twiddit.searchengine.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {



    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment findById(String id) {
        return commentRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    @Override
    public Comment create(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Comment update(Comment comment) {
        return commentRepository.save(comment);
    }
}
