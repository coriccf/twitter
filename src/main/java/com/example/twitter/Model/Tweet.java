package com.example.twitter.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Tweet {
    private String tweetear;
    private LocalDateTime date;
}
