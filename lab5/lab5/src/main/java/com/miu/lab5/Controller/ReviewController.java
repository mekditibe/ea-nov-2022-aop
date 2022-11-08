package com.miu.lab5.Controller;


import com.miu.lab5.Entity.Review;
import com.miu.lab5.Service.ReviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/reviews")
@RestController
public class ReviewController {

    @Autowired
    private ReviewServiceImpl reviewService;

    @GetMapping
    public List<Review> getAllReview(){
        return reviewService.getAllReview();
    }
    @GetMapping("/{Id}")
    public Review getReview(@PathVariable Long Id){
        return reviewService.getReview(Id);
    }

    @DeleteMapping("/{Id}")
    public void deleteReview(@PathVariable Long Id){
        reviewService.deleteReview(Id);
    }

    @PostMapping
    public void addReview(@RequestBody Review review){
        reviewService.saveReview(review);
    }

    @PutMapping
    public void updateReview(@RequestBody Review review){
        reviewService.updateReview(review);
    }
}
