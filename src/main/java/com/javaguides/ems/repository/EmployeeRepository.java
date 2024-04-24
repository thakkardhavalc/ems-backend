package com.javaguides.ems.repository;

import com.javaguides.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By dhhaval thakkar on 2024-04-23
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
