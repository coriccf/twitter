package com.example.twitter.Repository;

import com.example.twitter.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TwitterRepository extends MongoRepository<User, Integer> {
    List<User> findByName(String name);
    List<User> findByUsername(String username);


    //@Query(value = "{'User':{username:?0}}", fields = "{'username':1,'tweetear':1}")
    // @Query(value = "{'Follower': {$iduser:?0}}")
    //@Query("{'Follower.iduser':?0}")
   // List<User> abc(int iduser);
    //@Query("{'Address.city':?0}")
   // List<User> findByCity(String city);
}
