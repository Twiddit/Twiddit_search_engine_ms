package com.twiddit.searchengine.services.Impl;

import com.twiddit.searchengine.Repository.TwidditRepository;
import com.twiddit.searchengine.entities.Twiddit;
import com.twiddit.searchengine.services.TwidditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TwidditServiceImpl implements TwidditService {



    @Autowired
    private TwidditRepository twidditRepository;

    @Override
    public Twiddit findById(String id) {
        return twidditRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Twiddit> findAll() {
        return twidditRepository.findAll();
    }

    @Override
    public Twiddit create(Twiddit twiddit) {
        return twidditRepository.save(twiddit);
    }

    @Override
    public Twiddit update(Twiddit twiddit) {
        return twidditRepository.save(twiddit);
    }
}
