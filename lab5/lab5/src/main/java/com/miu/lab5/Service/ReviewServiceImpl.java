package com.miu.lab5.Service;

import com.miu.lab5.Entity.Review;
import com.miu.lab5.Middleware.Annotation.ExecuteGet;
import com.miu.lab5.Middleware.Annotation.ExecutionTime;
import com.miu.lab5.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@ExecuteGet
public class ReviewServiceImpl implements ReviewService{

    @Autowired
    private ReviewRepository reviewRepo;
    @Override
    public List<Review> getAllReview() {
        return reviewRepo.findAll();
    }
    @ExecutionTime
    @Override
    public Review getReview(Long Id) {
        return reviewRepo.findById(Id).get();
    }

    @Override
    public void deleteReview(Long Id) {
        reviewRepo.deleteById(Id);
    }

    @Override
    public void saveReview(Review review) {
        reviewRepo.save(review);
    }

    @Override
    public void updateReview(Review review) {
        reviewRepo.save(review);
    }
}
