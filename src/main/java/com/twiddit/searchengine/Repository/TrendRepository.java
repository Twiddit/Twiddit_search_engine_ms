package com.twiddit.searchengine.Repository;

import com.twiddit.searchengine.entities.Trend;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrendRepository extends MongoRepository<Trend,String> {
}
