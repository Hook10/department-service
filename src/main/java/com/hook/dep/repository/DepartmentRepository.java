package com.hook.dep.repository;

import com.hook.dep.entity.Department;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

  Optional<Department> findByDepartmentCode(String departmentCode);

}
