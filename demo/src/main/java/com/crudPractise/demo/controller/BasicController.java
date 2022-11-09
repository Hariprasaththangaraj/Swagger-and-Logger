package com.crudPractise.demo.controller;

import com.crudPractise.demo.entity.DtoRequest;
import com.crudPractise.demo.service.BasicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BasicController {

    @Autowired
    BasicService basicService;

    @PostMapping("/save")
    public String basicSave(@RequestBody DtoRequest dtoRequest){
        log.info("Controller Started !!!!");
        basicService.crudBasicSave(dtoRequest);
        return "Data Saved Successfully !!!";
    }
}
