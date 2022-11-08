package com.miu.lab5.Repository;

import com.miu.lab5.Entity.Review;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {
    @Query(value = "select r from Review r")
    List<Review> findAll();
}
