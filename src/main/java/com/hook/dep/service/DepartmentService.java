package com.hook.dep.service;

import com.hook.dep.dto.DepartmentDto;
import java.util.Optional;

public interface DepartmentService {

  DepartmentDto saveDepartment(DepartmentDto departmentDto);

  DepartmentDto getDepartmentByCode(String code);

}
