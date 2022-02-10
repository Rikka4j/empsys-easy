package com.example.demo.dao;/*
@author YangZD
**/

import com.example.demo.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<Employee> getEmployees();
//
    Employee getEmployeeById(Integer id);

    int save(Employee employee);

    Employee get(Integer id);

    int delete(Integer id);

    int update(Employee employee);
}
