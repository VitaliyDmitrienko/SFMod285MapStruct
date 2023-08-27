package org.example.Task2851;

import org.mapstruct.Mapper;

@Mapper
public interface DepartmentMapper {

    DepartmentDTO departmentToDto(Department entity);

    Department dtoToEntity(DepartmentDTO dto);

}
