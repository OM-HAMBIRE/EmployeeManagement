package com.assignment.employeemanage.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import com.assignment.employeemanage.dao.EmployeeManageDao;
import com.assignment.employeemanage.model.EmployeeManage;
@Service
public class EmployeeManageService {

    private final EmployeeManageDao employeeManageDao;

    @Autowired
    public EmployeeManageService(EmployeeManageDao employeeManageDao) {
        this.employeeManageDao = employeeManageDao;
    }

   

    public Page<EmployeeManage> getAllEmployeesWithPaginationAndSorting(int page, int pageSize, String sortBy) {
    	PageRequest pageable = PageRequest.of(page - 1, pageSize, Sort.by(sortBy));
        return employeeManageDao.findAll(pageable);
    }

    
    public String addEmployee(EmployeeManage employee) {
      
        String id = UUID.randomUUID().toString();
        employee.setId(id);
        employeeManageDao.save(employee);
        return id; 
    }
    public Iterable<EmployeeManage>getAllTickets()
    {
    	return employeeManageDao.findAll();	
    }
    
    public EmployeeManage getTicket(String id )
    {
    	return employeeManageDao.findById(id)
    			.orElse(new EmployeeManage());
    }
    
  
    
    public EmployeeManage updateTicket(String id,String newEmailid)
    {
    	EmployeeManage dbempObj=getTicket(id);
    	dbempObj.setEmail(newEmailid);
    	return employeeManageDao.save(dbempObj);
    	
    	
    }
    public void deleteTicket(String id)
    {
    	employeeManageDao.deleteById(id);
    }
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


    

