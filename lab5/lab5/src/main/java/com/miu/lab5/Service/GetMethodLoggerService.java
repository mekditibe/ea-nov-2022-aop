package com.miu.lab5.Service;

import com.miu.lab5.Entity.GetMethodLogger;

import java.util.List;

public interface GetMethodLoggerService {
    List<GetMethodLogger> getAllGetMethodLogger();
    GetMethodLogger getGetMethodLogger(Long Id);
    void deleteGetMethodLogger(Long Id);
    void saveGetMethodLogger(GetMethodLogger getMethodLogger);
    void updateGetMethodLogger(GetMethodLogger getMethodLogger);
}
