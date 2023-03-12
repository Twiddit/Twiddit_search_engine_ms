package com.twiddit.searchengine.services;

import com.twiddit.searchengine.entities.DisLike;
import com.twiddit.searchengine.entities.Like;

public interface DisLikeService {

    DisLike findById(String id);

    DisLike findAll();

    DisLike create(DisLike disLike);

    DisLike update(DisLike disLike);
}
