package com.miu.lab5.Service;

import com.miu.lab5.Entity.GetMethodLogger;
import com.miu.lab5.Repository.GetMethodLoggerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetMethodServiceImpl implements GetMethodLoggerService{

    @Autowired
    private GetMethodLoggerRepository getMethodLoggerRepository;

    @Override
    public List<GetMethodLogger> getAllGetMethodLogger() {
        return getMethodLoggerRepository.findAll();
    }

    @Override
    public GetMethodLogger getGetMethodLogger(Long Id) {
        return getMethodLoggerRepository.findById(Id).get();
    }

    @Override
    public void deleteGetMethodLogger(Long Id) {
        getMethodLoggerRepository.deleteById(Id);
    }

    @Override
    public void saveGetMethodLogger(GetMethodLogger getMethodLogger) {
        getMethodLoggerRepository.save(getMethodLogger);
    }

    @Override
    public void updateGetMethodLogger(GetMethodLogger getMethodLogger) {
        getMethodLoggerRepository.save(getMethodLogger);
    }
}
