package com.twiddit.searchengine.Repository;

import com.twiddit.searchengine.entities.Like;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends MongoRepository<Like,String> {
}
