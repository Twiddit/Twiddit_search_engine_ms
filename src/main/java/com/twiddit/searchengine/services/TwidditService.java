package com.twiddit.searchengine.services;

import com.twiddit.searchengine.entities.Twiddit;
import com.twiddit.searchengine.entities.User;

import java.util.List;

public interface TwidditService {

    Twiddit findById(String id);

    List<Twiddit> findAll();

    Twiddit create(Twiddit twiddit);

    Twiddit update(Twiddit twiddit);

    List<Twiddit> findByTextContaining(String text);
}
