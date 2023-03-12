package com.twiddit.searchengine.services.Impl;

import com.twiddit.searchengine.Repository.DisLikeRepository;
import com.twiddit.searchengine.entities.DisLike;
import com.twiddit.searchengine.services.DisLikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class DisLikeServiceImpl implements DisLikeService {


    @Autowired
    private DisLikeRepository disLikeRepository;


    @Override
    public DisLike findById(String id) {
        return disLikeRepository.findById(id).orElseThrow();
    }

    @Override
    public List<DisLike> findAll() {
        return disLikeRepository.findAll();
    }

    @Override
    public DisLike create(DisLike disLike) {
        return disLikeRepository.save(disLike);
    }

    @Override
    public DisLike update(DisLike disLike) {
        return disLikeRepository.save(disLike);
    }
}
