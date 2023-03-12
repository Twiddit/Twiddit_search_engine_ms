package com.twiddit.searchengine.services.Impl;

import com.twiddit.searchengine.Repository.LikeRepository;
import com.twiddit.searchengine.entities.Like;
import com.twiddit.searchengine.services.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeServiceImpl implements LikeService {

    @Autowired
    private LikeRepository likeRepository;

    @Override
    public Like findById(String id) {
        return likeRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Like> findAll() {
        return likeRepository.findAll();
    }

    @Override
    public Like create(Like like) {
        return likeRepository.save(like);
    }

    @Override
    public Like update(Like like) {
        return likeRepository.save(like);
    }
}
