package com.twiddit.searchengine.Repository;

import com.twiddit.searchengine.entities.Comment;
import com.twiddit.searchengine.entities.Twiddit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TwidditRepository extends MongoRepository<Twiddit,String> {

    List<Twiddit> findByTextContaining(String text);
}
