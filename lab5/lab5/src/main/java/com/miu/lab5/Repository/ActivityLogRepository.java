package com.miu.lab5.Repository;

import com.miu.lab5.Entity.ActivityLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityLogRepository extends CrudRepository<ActivityLog, Long> {

    List<ActivityLog> findAll();


}
