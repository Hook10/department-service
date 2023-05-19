package com.hook.dep.mapper;

import com.hook.dep.dto.DepartmentDto;
import com.hook.dep.entity.Department;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

  DepartmentDto toDto(Department department);

  Department toEntity(DepartmentDto departmentDto);

}
