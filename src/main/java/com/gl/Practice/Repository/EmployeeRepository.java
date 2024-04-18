package com.gl.Practice.Repository;


import com.gl.Practice.model.Address;
import com.gl.Practice.model.Employee;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Employee findByName(String name);


}

//    List<Employee> employeeList = new ArrayList<>();
//
//    Address address1 = new Address(1,"Nagpur", "Maharashtra","440010");
//    Address address2 = new Address(2,"Bangalore", "Karnataka","123456");
//
//    Employee empl1 = new Employee(1,"empl1",address1);
//    Employee empl2 = new Employee(2,"empl2",address2);
//    Employee empl3 = new Employee(3,"empl3",address1);
//    Employee empl4 = new Employee(4,"empl4",address2);
//    Employee empl5 = new Employee(5,"empl5",address1);
//
//
//    public List<Employee> getAll() {
//        employeeList.add(empl1);
//        employeeList.add(empl2);
//        employeeList.add(empl3);
//        employeeList.add(empl4);
//        employeeList.add(empl5);
//
//        return employeeList;
//    }

