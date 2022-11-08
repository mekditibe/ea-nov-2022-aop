package com.miu.lab5.Service;

import com.miu.lab5.Entity.ActivityLog;


import java.util.List;

public interface ActivityLogService{
    List<ActivityLog> getAllActivityLog();
    ActivityLog getActivityLog(Long Id);
    void deleteActivityLog(Long Id);
    void saveActivityLog(ActivityLog activityLog);
    void updateActivityLog(ActivityLog activityLog);
}
