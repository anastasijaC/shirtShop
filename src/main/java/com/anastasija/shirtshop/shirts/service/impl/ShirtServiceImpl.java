package com.anastasija.shirtshop.shirts.service.impl;

import com.anastasija.shirtshop.shirts.model.Shirt;
import com.anastasija.shirtshop.shirts.repository.ShirtRepository;
import com.anastasija.shirtshop.shirts.service.ShirtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShirtServiceImpl implements ShirtService{

    @Autowired
    ShirtRepository repository;

    @Override
    public List<Shirt> findAll() {
        return repository.findAll();
    }
}
