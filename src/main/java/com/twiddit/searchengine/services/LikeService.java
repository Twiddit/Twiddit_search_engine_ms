package com.twiddit.searchengine.services;

import com.twiddit.searchengine.entities.Like;
import com.twiddit.searchengine.entities.Trend;

import java.util.List;

public interface LikeService {

    Like findById(String id);

    List<Like> findAll();

    Like create(Like like);

    Like update(Like like);
}
