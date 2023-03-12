package com.twiddit.searchengine.services;

import com.twiddit.searchengine.entities.Like;
import com.twiddit.searchengine.entities.Trend;

public interface LikeService {

    Like findById(String id);

    Like findAll();

    Like create(Like like);

    Like update(Like like);
}
