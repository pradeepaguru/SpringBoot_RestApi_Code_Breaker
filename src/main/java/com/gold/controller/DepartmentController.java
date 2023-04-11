package com.gold.controller;

import com.gold.entity.Department;
import com.gold.exceptionHandling.DepartmentIDNotFound;
import com.gold.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {
  @Autowired
    private DepartmentService departmentService;

  private Logger Logger = LoggerFactory.getLogger(DepartmentController.class);
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) throws DepartmentIDNotFound {
        Logger.info("Added Department info");
        return departmentService.saveDepartment(department);
    }
@GetMapping("/departments")

    public List<Department> fetchDepartments(){
    Logger.info("Get Department info");
      return departmentService.fetchDepartments();
    }
  @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentIDNotFound {
      return departmentService.fetchDepartmentById(departmentId);
    }
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentIDNotFound {
        departmentService.deleteDepartmentId(departmentId);
        return "Successfully Deleted!!!";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartmentById(@PathVariable("id") Long departmentId, @RequestBody Department department){

        return departmentService.updateDepartment(departmentId,department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentById(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentName(departmentName);
    }

    @GetMapping("/departments/code/{id}")
    public String fetchDepartmentCodeById(@PathVariable("id") Long deptId){
        return departmentService.fetchDepartmentCode(deptId);
    }
}
