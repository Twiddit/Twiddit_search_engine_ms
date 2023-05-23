package com.twiddit.searchengine.Repository;

import com.twiddit.searchengine.entities.Twiddit;
import com.twiddit.searchengine.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

    List<User> findByUsernameContaining(String text);
}
