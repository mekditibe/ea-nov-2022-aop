package com.miu.lab5.Controller;

import com.miu.lab5.Entity.GetMethodLogger;
import com.miu.lab5.Service.GetMethodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/logger")
@RestController
public class GetMethodController {

    @Autowired
    private GetMethodServiceImpl getMethodService;


    @GetMapping
    public List<GetMethodLogger> getAllGetMethodLogger(){
        return getMethodService.getAllGetMethodLogger();
    }
    @GetMapping("/{Id}")
    public GetMethodLogger getGetMethodLogger(@PathVariable Long Id){
        return getMethodService.getGetMethodLogger(Id);
    }

    @DeleteMapping("/{Id}")
    public void deleteGetMethodLogger(@PathVariable Long Id){
        getMethodService.deleteGetMethodLogger(Id);
    }

    @PostMapping
    public void  addGetMethodLogger(@RequestBody GetMethodLogger getMethodLogger){
        getMethodService.saveGetMethodLogger(getMethodLogger);
    }

    @PutMapping
    public void updateGetMethodLogger(@RequestBody GetMethodLogger getMethodLogger){
        getMethodService.updateGetMethodLogger(getMethodLogger);
    }

}
