package com.blog1app.controller;

import com.blog1app.payload.PostDto;
import com.blog1app.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    //http://localhost:8080/api/posts
    @PostMapping
    public ResponseEntity<PostDto>savedPost(@RequestBody PostDto postDto){
        PostDto dto = postService.savedPost(postDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);

    }


}
