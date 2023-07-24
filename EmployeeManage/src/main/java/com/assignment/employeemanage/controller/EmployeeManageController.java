package com.assignment.employeemanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.employeemanage.model.EmployeeManage;
import com.assignment.employeemanage.service.EmployeeManageService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;

@RestController
@RequestMapping("/employees")
public class EmployeeManageController {

    private final EmployeeManageService employeeService;

    @Autowired
    public EmployeeManageController(EmployeeManageService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/create")
    public String createEmployee(@RequestBody EmployeeManage inputObj) {
        return employeeService.addEmployee(inputObj);
    }

    @GetMapping("/all-employees") // Unique mapping for get all employees
    public Page<EmployeeManage> getAllEmployees(@RequestParam(defaultValue = "1") int page,
                                                @RequestParam(defaultValue = "10") int pageSize,
                                                @RequestParam(defaultValue = "employeeName") String sortBy) {
        return employeeService.getAllEmployeesWithPaginationAndSorting(page, pageSize, sortBy);
    }

    @GetMapping(value = "/all")
    public Iterable<EmployeeManage> getAllTickets() {
        return employeeService.getAllTickets();
    }

    @GetMapping(value = "/{id}")
    public EmployeeManage retrieveTicket(@PathVariable("id") String id) {
        return employeeService.getTicket(id);
    }

    @PutMapping(value = "/{id}/{newEmailid}")
    public EmployeeManage updateTicket(@PathVariable("id") String id, @PathVariable("newEmailid") String newEmailid) {
        return employeeService.updateTicket(id, newEmailid);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteTicket(@PathVariable("id") String id) {
        employeeService.deleteTicket(id);
    }
}
