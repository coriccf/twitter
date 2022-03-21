package com.example.twitter.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Follower {
    private int iduser;
    private LocalDateTime date ;
}
