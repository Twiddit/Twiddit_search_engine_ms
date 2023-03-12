package com.twiddit.searchengine.Repository;

import com.twiddit.searchengine.entities.DisLike;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DisLikeRepository extends MongoRepository<DisLike,String> {
}
