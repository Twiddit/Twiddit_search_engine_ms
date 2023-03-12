package com.twiddit.searchengine.Repository;

import com.twiddit.searchengine.entities.Like;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LikeRepository extends MongoRepository<Like,String> {
}
