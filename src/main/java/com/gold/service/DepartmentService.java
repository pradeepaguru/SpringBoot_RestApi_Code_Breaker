package com.gold.service;

import com.gold.entity.Department;
import com.gold.exceptionHandling.DepartmentIDNotFound;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartments();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentIDNotFound;


    public void deleteDepartmentId(Long departmentId) throws DepartmentIDNotFound;


    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentName(String departmentName);

    public String  fetchDepartmentCode(Long deptId);
}
