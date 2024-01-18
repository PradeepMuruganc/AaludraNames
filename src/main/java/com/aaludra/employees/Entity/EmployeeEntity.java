package com.aaludra.employees.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection="Employee")
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
    @Field(name="Aaludra Employee Name")
    private String name;

}
