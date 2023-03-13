package com.twiddit.searchengine.controllers;

import com.twiddit.searchengine.entities.Comment;
import com.twiddit.searchengine.entities.Twiddit;
import com.twiddit.searchengine.services.CommentService;
import com.twiddit.searchengine.services.TwidditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping
    private ResponseEntity<List<Comment>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(commentService.findAll());
    }

    @PostMapping
    private ResponseEntity<Comment> create(@RequestBody Comment comment){
        return ResponseEntity.status(HttpStatus.OK).body(commentService.create(comment));
    }


    @GetMapping("findByText/{text}")
    private ResponseEntity<List<Comment>> findByText(@PathVariable String text){
        return ResponseEntity.status(HttpStatus.OK).body(commentService.findByTextContaining(text));
    }

}
