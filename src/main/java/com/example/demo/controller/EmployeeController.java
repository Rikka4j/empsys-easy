package com.example.demo.controller;

import com.example.demo.dao.DepartmentMapper;
import com.example.demo.dao.EmployeeMapper;
import com.example.demo.pojo.Department;
import com.example.demo.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * <p>
 *
 * </p>
 *
 * @author wpc
 * @since 2021/8/25
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    DepartmentMapper departmentMapper;

    @RequestMapping("/emps")
    public String list(Model model){
        Collection<Employee> all = employeeMapper.getEmployees();
        model.addAttribute("emps",all);
        return "/emp/list";
    }
//
    @GetMapping("/emp")
    public String toAddPage(Model model){
        Collection<Department> departments = departmentMapper.getDepartment();
        model.addAttribute("departments",departments);
        return "/emp/add";
    }
    @RequestMapping(value = "/test" ,method = RequestMethod.POST)
    public String test(Employee employee){
        int update = employeeMapper.update(employee);
        System.out.println(update);
        return "redirect:/emps";
    }
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        System.out.println("123456");
        System.out.println(employee);
        employeeMapper.save(employee);
        return "redirect:/emps";
    }
    @GetMapping("/emp/{id}")
    public String toUpdateEmp(@PathVariable("id") Integer id, Model model){
        System.out.println(id);
        Employee employee = employeeMapper.getEmployeeById(id);
         model.addAttribute("emp",employee);
        Collection<Department> departments = departmentMapper.getDepartment();
        model.addAttribute("departments",departments);
        return "/emp/update";
    }
    @GetMapping("/delEmp/{id}")
    public String delEmp(@PathVariable("id") Integer id){
        employeeMapper.delete(id);
        return "redirect:/emps";
    }
}
