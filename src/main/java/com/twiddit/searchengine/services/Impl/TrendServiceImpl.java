package com.twiddit.searchengine.services.Impl;

import com.twiddit.searchengine.Repository.TrendRepository;
import com.twiddit.searchengine.entities.Trend;
import com.twiddit.searchengine.services.TrendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrendServiceImpl implements TrendService {



    @Autowired
    private TrendRepository trendRepository;

    @Override
    public Trend findById(String id) {
        return trendRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Trend> findAll() {
        return trendRepository.findAll();
    }

    @Override
    public Trend create(Trend trend) {
        return trendRepository.save(trend);
    }

    @Override
    public Trend update(Trend trend) {
        return trendRepository.save(trend);
    }
}
