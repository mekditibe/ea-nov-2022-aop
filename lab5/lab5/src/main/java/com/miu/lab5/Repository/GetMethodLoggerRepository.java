package com.miu.lab5.Repository;

import com.miu.lab5.Entity.GetMethodLogger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface GetMethodLoggerRepository extends CrudRepository<GetMethodLogger,Long> {
    List<GetMethodLogger> findAll();
}
