package com.twiddit.searchengine.services;

import com.twiddit.searchengine.entities.Trend;
import com.twiddit.searchengine.entities.Twiddit;

import java.util.List;

public interface TrendService {

    Trend findById(String id);

    List<Trend> findAll();

    Trend create(Trend trend);

    Trend update(Trend trend);
}
