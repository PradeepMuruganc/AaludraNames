package com.aaludra.employees.Repository;

import com.aaludra.employees.Entity.EmployeeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<EmployeeEntity, String> {
}
