package com.twiddit.searchengine.services;

import com.twiddit.searchengine.entities.Twiddit;
import com.twiddit.searchengine.entities.User;

public interface TwidditService {

    Twiddit findById(String id);

    Twiddit findAll();

    Twiddit create(Twiddit twiddit);

    Twiddit update(Twiddit twiddit);
}
