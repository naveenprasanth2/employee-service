package com.javaguides.departmentservice.controller;

import com.javaguides.departmentservice.dto.DepartmentDto;
import com.javaguides.departmentservice.service.impl.DepartmentServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/departments")
@AllArgsConstructor
public class DepartmentController {

    private final DepartmentServiceImpl departmentService;

    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto){
        return new ResponseEntity<>(departmentService.saveDepartment(departmentDto), HttpStatus.CREATED);
    }

    @GetMapping("/{department-code}")
    public ResponseEntity<DepartmentDto> findByDepartmentCode(@PathVariable("department-code") String departmentCode){
        return new ResponseEntity<>(departmentService.findByDepartmentCode(departmentCode), HttpStatus.OK);
    }


}
