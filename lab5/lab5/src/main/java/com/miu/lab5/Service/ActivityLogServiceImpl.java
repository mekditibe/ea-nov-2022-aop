package com.miu.lab5.Service;

import com.miu.lab5.Entity.ActivityLog;
import com.miu.lab5.Middleware.Annotation.ExecuteGet;
import com.miu.lab5.Repository.ActivityLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActivityLogServiceImpl implements ActivityLogService{

    @Autowired
    private ActivityLogRepository activityLogRepo;

    @Override
    public List<ActivityLog> getAllActivityLog() {
        return activityLogRepo.findAll();
    }

    @Override
    public ActivityLog getActivityLog(Long Id) {
        return activityLogRepo.findById(Id).get();
    }

    @Override
    public void deleteActivityLog(Long Id) {
        activityLogRepo.deleteById(Id);
    }

    @Override
    public void saveActivityLog(ActivityLog activityLog) {
        activityLogRepo.save(activityLog);
    }

    @Override
    public void updateActivityLog(ActivityLog activityLog) {
        activityLogRepo.save(activityLog);
    }
}
