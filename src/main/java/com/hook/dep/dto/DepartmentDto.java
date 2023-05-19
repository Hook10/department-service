package com.hook.dep.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {

  private Long id;
  @NotNull
  @Size(min = 2, message = "Department name should have at least 2 characters")
  private String departmentName;
  @NotNull
  @Size(min = 2, message = "Department description should have at least 2 characters")
  private String departmentDescription;
  @NotNull
  @Size(min = 2, message = "Department code should have at least 2 characters")
  private String departmentCode;

}
