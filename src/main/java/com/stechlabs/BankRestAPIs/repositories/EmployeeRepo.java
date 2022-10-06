package com.stechlabs.BankRestAPIs.repositories;

import com.stechlabs.BankRestAPIs.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

/*    @Query(value = "select e.employee_id,e.bank_branch_id,e.department_id,e.person_id,e.hourly_rate,e.password,e.salary,e.job_title_id,p.fname,p.lname,p.age,bb.branch_name,d.department_name,jt.title from person as p,employee as e,bank_branch as bb,job_title as jt,department as d where e.bank_branch_id=bb.branch_id and e.department_id=d.department_id and e.job_title_id=jt.job_title_id and e.person_id=p.person_id;",nativeQuery = true)
 List<Employee> getEmployees();*/


}
