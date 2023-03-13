package com.twiddit.searchengine.Repository;

import com.twiddit.searchengine.entities.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends MongoRepository<Comment,String> {

    List<Comment> findByTextContaining(String text);
}
