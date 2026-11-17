package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.*;

public interface AirConditionerService {

    AirConditionerServiceEntity add(
            AirConditionerServiceEntity entity);

    List<AirConditionerServiceEntity> displayAll();

}