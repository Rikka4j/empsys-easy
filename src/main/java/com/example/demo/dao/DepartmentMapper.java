package com.example.demo.dao;/*
@author YangZD
**/


import com.example.demo.pojo.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    List<Department> getDepartment();

    Department getDepartmentById(Integer id);
}
