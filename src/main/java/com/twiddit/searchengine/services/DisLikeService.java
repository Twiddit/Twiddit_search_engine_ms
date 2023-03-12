package com.twiddit.searchengine.services;

import com.twiddit.searchengine.entities.DisLike;
import com.twiddit.searchengine.entities.Like;

import java.util.List;

public interface DisLikeService {

    DisLike findById(String id);

    List<DisLike> findAll();

    DisLike create(DisLike disLike);

    DisLike update(DisLike disLike);
}
