package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.exam.entity.AirConditionerServiceEntity;
import com.klef.soa.exam.service.AirConditionerService;

@RestController
@CrossOrigin(origins = "*")
public class AirConditionerServiceController {

    @Autowired
    private AirConditionerService service;

    @GetMapping("/")
    public String home() {
        return "Air Conditioner Service is running";
    }

    @PostMapping("/Add")
    public ResponseEntity<AirConditionerServiceEntity> add(
            @RequestBody AirConditionerServiceEntity entity) {

        AirConditionerServiceEntity savedEntity =
                service.add(entity);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedEntity);
    }

    @GetMapping("/DisplayAll")
    public List<AirConditionerServiceEntity> displayAll() {
        return service.displayAll();
    }

}