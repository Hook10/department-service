package com.hook.dep.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(
        description = "DepartmentDto Model Information"
)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {

  private Long id;

  @Schema(description = "Department Name")
  @NotNull
  @Size(min = 2, message = "Department name should have at least 2 characters")
  private String departmentName;

  @Schema(description = "Department Description")
  @NotNull
  @Size(min = 2, message = "Department description should have at least 2 characters")
  private String departmentDescription;

  @Schema(description = "Department Code")
  @NotNull
  @Size(min = 2, message = "Department code should have at least 2 characters")
  private String departmentCode;

}
