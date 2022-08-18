package com.karaguzel.data.repository;

import com.karaguzel.data.entity.EmployeeEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepository extends PagingAndSortingRepository<EmployeeEntity,Long> {

    //delived Query
    List<EmployeeEntity> findEmployeeEntitiesByEmployeeNameStartsWith(String name);


}
