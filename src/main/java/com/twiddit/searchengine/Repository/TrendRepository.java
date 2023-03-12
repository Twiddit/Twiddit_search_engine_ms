package com.twiddit.searchengine.Repository;

import com.twiddit.searchengine.entities.Trend;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrendRepository extends MongoRepository<Trend,String> {
}
