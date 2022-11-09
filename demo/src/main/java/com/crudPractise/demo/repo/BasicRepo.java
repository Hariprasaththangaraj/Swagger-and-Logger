package com.crudPractise.demo.repo;

import com.crudPractise.demo.entity.DtoResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicRepo extends JpaRepository<DtoResponse, Integer> {
}
