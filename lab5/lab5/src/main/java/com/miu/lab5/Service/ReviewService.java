package com.miu.lab5.Service;

import com.miu.lab5.Entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewService{

    List<Review> getAllReview();
    Review getReview(Long Id);
    void deleteReview(Long Id);
    void saveReview(Review review);
    void updateReview(Review review);
}
