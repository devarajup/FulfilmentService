package com.cjss.FulfilmentService.controller;

import com.cjss.FulfilmentService.model.StatusUpdate;
import com.cjss.FulfilmentService.service.FulfilmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private FulfilmentService service;
    @PostMapping("/")
    public StatusUpdate statusUpdate(@RequestBody StatusUpdate statusUpdate){
        return  service.upadateStatus(statusUpdate);
    }

}
