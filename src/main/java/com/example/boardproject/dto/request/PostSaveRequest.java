package com.example.boardproject.dto.request;

import com.example.boardproject.domain.Post;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostSaveRequest {

    private String title;
    private String content;

    public Post toEntity() {
        return Post.builder()
                .title(title)
                .content(content)
                .createDate(LocalDateTime.now())
                .build();
    }

}