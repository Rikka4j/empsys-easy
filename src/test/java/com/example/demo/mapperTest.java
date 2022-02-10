package com.example.demo;/*
@author YangZD
**/

import com.example.demo.dao.DepartmentMapper;
import com.example.demo.pojo.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = DemoApplication.class)
public class mapperTest {
    @Autowired
    DepartmentMapper departmentMapper;
    @Test
    public void testT(){
        List<Department> department = departmentMapper.getDepartment();
        System.out.println(department);
    }
}
