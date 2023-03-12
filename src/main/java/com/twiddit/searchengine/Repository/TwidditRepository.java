package com.twiddit.searchengine.Repository;

import com.twiddit.searchengine.entities.Twiddit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TwidditRepository extends MongoRepository<Twiddit,String> {
}
