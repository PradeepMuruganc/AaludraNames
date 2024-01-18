package com.aaludra.employees.Service;

import com.aaludra.employees.Entity.EmployeeEntity;
import com.aaludra.employees.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<EmployeeEntity> getName()

    {
        return employeeRepository.findAll();
    }
}
