package com.anastasija.shirtshop.shirts.repository;

import com.anastasija.shirtshop.shirts.model.Shirt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShirtRepository extends CrudRepository<Shirt, Long> {
    List<Shirt> findAll();
}
