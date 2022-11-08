package com.miu.lab5.Controller;

import com.miu.lab5.Entity.ActivityLog;
import com.miu.lab5.Service.ActivityLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActivityLogController {

    @Autowired
    private ActivityLogServiceImpl activityLogService;

    @GetMapping
    public List<ActivityLog> getAllActivityLog(){
        return activityLogService.getAllActivityLog();
    }
    @GetMapping("/{Id}")
    public ActivityLog getActivityLog(@PathVariable Long Id){
        return activityLogService.getActivityLog(Id);
    }

    @DeleteMapping("/{Id}")
    public void deleteActivityLog(@PathVariable Long Id){
        activityLogService.deleteActivityLog(Id);
    }

    @PostMapping
    public void addActivityLog(@RequestBody ActivityLog activityLog){
        activityLogService.saveActivityLog(activityLog);
    }
    @PutMapping
    public void updateActivityLog(@RequestBody ActivityLog activityLog){
        activityLogService.updateActivityLog(activityLog);
    }


}
