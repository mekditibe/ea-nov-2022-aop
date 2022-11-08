package com.miu.lab5.Middleware;

import com.miu.lab5.Entity.ActivityLog;
import com.miu.lab5.Entity.CompositeKey.ProductCategoryKey;
import com.miu.lab5.Entity.Review;
import com.miu.lab5.Repository.ActivityLogRepository;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Aspect
@Component
public class AspectExecutionTime {

    @Autowired
    private ActivityLogRepository activityLogRepo;

    @Pointcut("@annotation(com.miu.lab5.Middleware.Annotation.ExecutionTime)")
    public void executionTimeAnnotation() {
    }

    @Around("executionTimeAnnotation()")
    public Review logger(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        Long start = System.nanoTime();
        Review result=(Review) proceedingJoinPoint.proceed();
        Long duration =  (System.nanoTime()) - start;
        ActivityLog activityLog= new ActivityLog();
        activityLog.setDate(LocalDate.now());
        activityLog.setDuration(duration);
        activityLog.setOperation("This is from Aspect class");
        ProductCategoryKey Id= new ProductCategoryKey(result.getProduct().getId(),result.getProduct().getCategory().getId());//
        activityLog.setProductCategoryKey(Id);
        activityLogRepo.save(activityLog);
        return result;
    }


}
