package com.twiddit.searchengine.Repository;

import com.twiddit.searchengine.entities.Twiddit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TwidditRepository extends MongoRepository<Twiddit,String> {
}
