package com.example.twitter.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document(collection = "coll_DB")
public class User {
    @Id
    private int iduser;
    private String name;
    private String username;
    private String information;
    private List<Tweet>tweets;
    private Follower followers;


}
