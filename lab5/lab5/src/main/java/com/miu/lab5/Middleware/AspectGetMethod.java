package com.miu.lab5.Middleware;

import com.miu.lab5.Entity.GetMethodLogger;
import com.miu.lab5.Repository.GetMethodLoggerRepository;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Aspect
@Component
public class AspectGetMethod {

    @Autowired
    private GetMethodLoggerRepository getMethodLoggerRepository;
    @Pointcut("@annotation(com.miu.lab5.Middleware.Annotation.ExecuteGet)")
    public void executionGetAnnotation() {
    }

    @Around("executionGetAnnotation()")
    public Object getAllMethode(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        Long start = System.nanoTime();
        System.out.println("What time in Long: "+ start);
        Object result= proceedingJoinPoint.proceed();
        Long duration =  (System.nanoTime()) - start;
        GetMethodLogger getMethodLogger= new GetMethodLogger();
        getMethodLogger.setDate(LocalDate.now());
        getMethodLogger.setDuration(duration);
        getMethodLogger.setOperation("This is from Aspect class");
        getMethodLogger.setName(result.getClass().getSimpleName());
        getMethodLoggerRepository.save(getMethodLogger);
        return result;
    }

}
