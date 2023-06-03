package com.javaguides.departmentservice.service;

import com.javaguides.departmentservice.dto.DepartmentDto;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);

    DepartmentDto findByDepartmentCode(String DepartmentDto);
}
