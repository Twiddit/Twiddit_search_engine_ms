package com.twiddit.searchengine.controllers;

import com.twiddit.searchengine.entities.Twiddit;
import com.twiddit.searchengine.services.TwidditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/twiddit")
public class TwidditController {

    @Autowired
    private TwidditService twidditService;


    @GetMapping
    private ResponseEntity<List<Twiddit>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(twidditService.findAll());
    }

    @PostMapping
    private ResponseEntity<Twiddit> create(@RequestBody Twiddit twiddit){
        return ResponseEntity.status(HttpStatus.OK).body(twidditService.create(twiddit));
    }

    @GetMapping("findByText/{text}")
    private ResponseEntity<List<Twiddit>> findByText(@PathVariable String text){
        return ResponseEntity.status(HttpStatus.OK).body(twidditService.findByTextContaining(text));
    }



}
