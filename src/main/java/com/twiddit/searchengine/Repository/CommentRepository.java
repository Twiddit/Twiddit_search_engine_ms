package com.twiddit.searchengine.Repository;

import com.twiddit.searchengine.entities.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment,String> {
}
