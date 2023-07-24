package com.hook.dep.service;

import com.hook.dep.dto.DepartmentDto;

public interface DepartmentService {

  DepartmentDto saveDepartment(DepartmentDto departmentDto);

  DepartmentDto getDepartmentByCode(String code);

}
