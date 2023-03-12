package com.twiddit.searchengine.Repository;

import com.twiddit.searchengine.entities.DisLike;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisLikeRepository extends MongoRepository<DisLike,String> {
}
