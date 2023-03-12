package com.twiddit.searchengine.services;

import com.twiddit.searchengine.entities.Trend;
import com.twiddit.searchengine.entities.Twiddit;

public interface TrendService {

    Trend findById(String id);

    Trend findAll();

    Trend create(Trend trend);

    Trend update(Trend trend);
}
