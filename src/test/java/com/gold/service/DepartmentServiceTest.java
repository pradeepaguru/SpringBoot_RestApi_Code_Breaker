package com.gold.service;

import com.gold.entity.Department;
import com.gold.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentServiceTest {



    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department =
                Department.builder()
                        .departmentName("IT")
                        .departmentAddress("Ahmedabad")
                        .departmentCode("IT-06")
                        .departmentId(1L)
                        .build();

        Mockito.when(departmentRepository.findByDepartmentName("IT"))
                .thenReturn(department);

    }

    @Test
    @DisplayName("Get Data based on Valida Department Name")
    public void whenValidDepartmentName_thenDepartmentShouldFound() {
        String departmentName = "IT";
        Department found =
                departmentService.fetchDepartmentName(departmentName);

        assertEquals(departmentName, found.getDepartmentName());
    }
}


//    @Autowired
//    private DepartmentService departmentService;
//    @MockBean
//    private DepartmentRepository departmentrepository;
//    @BeforeEach
//    void setUp() {
//        Department department = Department.builder().departmentId(1L).departmentName("IT").departmentAddress("Madurai")
//                .departmentCode("It-90").build();
//
//        Mockito.when(departmentrepository.findByDepartmentName("IT")).thenReturn(department);
//    }
//    @Test
//    @DisplayName("FirstTest")
//    public void whenValidDepartmentName_thenDepartmentShouldFound(){
//        String departmentName = "IT";
//        Department found = departmentService.fetchDepartmentName(departmentName);
//        assertEquals(departmentName, found.getDepartmentName());
//    }
//}