package com.crudPractise.demo.service;

import com.crudPractise.demo.entity.DtoRequest;
import com.crudPractise.demo.entity.DtoResponse;
import com.crudPractise.demo.repo.BasicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicService {

    @Autowired
    BasicRepo basicRepo;

    public void crudBasicSave(DtoRequest dtoRequest) {
        DtoResponse dtoResponse = new DtoResponse();
        dtoResponse.setName(dtoRequest.getName());
        basicRepo.save(dtoResponse);
    }
}
