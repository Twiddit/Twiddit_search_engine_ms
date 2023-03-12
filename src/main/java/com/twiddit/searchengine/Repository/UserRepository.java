package com.twiddit.searchengine.Repository;

import com.twiddit.searchengine.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
