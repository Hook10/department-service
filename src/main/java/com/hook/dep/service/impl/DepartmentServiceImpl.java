package com.hook.dep.service.impl;

import com.hook.dep.dto.DepartmentDto;
import com.hook.dep.entity.Department;
import com.hook.dep.mapper.DepartmentMapper;
import com.hook.dep.repository.DepartmentRepository;
import com.hook.dep.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

  private final DepartmentRepository departmentRepository;
  private final DepartmentMapper departmentMapper;

  @Override
  public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

    // convert departmentDto to department jpa entity
    Department department = departmentMapper.toEntity(departmentDto);

    Department savedDepartment = departmentRepository.save(department);
    return departmentMapper.toDto(savedDepartment);
  }

  @Override
  public DepartmentDto getDepartmentByCode(String departmentCode) {
    Department department = departmentRepository.findByDepartmentCode(departmentCode);

    return departmentMapper.toDto(department);
  }
}
