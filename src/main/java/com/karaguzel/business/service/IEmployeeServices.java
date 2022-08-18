package com.karaguzel.business.service;

import com.karaguzel.business.dto.EmployeeDto;
import com.karaguzel.data.entity.EmployeeEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface IEmployeeServices {

    //ModelMapper
    public EmployeeDto entityToDto(EmployeeEntity employeeEntity);
    public EmployeeDto dtoToEntity(EmployeeDto employeeDto);

    //save
    public EmployeeDto createEmployee(EmployeeDto employeeDto);

    //list
    public List<EmployeeDto> getAllEmployee(EmployeeDto employeeDto);

    //find
    public ResponseEntity<EmployeeDto> getEmployeeById(Long id);

    //update
    public ResponseEntity<Map<String,Boolean>> deleteEmployee(Long id,EmployeeDto employeeDto);

    //delete
    public ResponseEntity<EmployeeDto> deleteEmployee(Long id);


}
