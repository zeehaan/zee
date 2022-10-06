package com.stechlabs.BankRestAPIs.controller;


import com.stechlabs.BankRestAPIs.models.*;
import com.stechlabs.BankRestAPIs.models.Error;
import com.stechlabs.BankRestAPIs.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(value = "api/")
public class Controller {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private EmployeeRepo employeeRepository;

    @Autowired
    private BankBranchRepository Bank_Branch_repo;
    @Autowired
    private DepartmentRepository Department_Repos;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private EmailTrackingRepository emailTrackingRepository;
    @Autowired
    private JobTitleRepository jobTitleRepository;
    @Autowired
    private AccountTypesRepository accountTypesRepository;
    @Autowired
    private TransactionTypeRepository transactionTypeRepository;


    @GetMapping("")
    private Error sendError(){
        return new Error("resource does not exist") ;
    }


    @GetMapping(value = "")
    private List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping(value = "employee/get/{id}")
    private Employee getEmployeeById(@PathVariable int id){
        return employeeRepository.findById(id).get();
    }

    @PostMapping(value = "employee/add")
    private Employee addEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }


    @PostMapping(value = "customer/add")
    private Customer addCustomer(@RequestBody Customer customer){
       return customerRepository.save(customer);
    }

    @GetMapping(value = "customers/get")
    private List<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    @GetMapping(value = "customer/get/{id}")
    private Customer getCustomerById(@PathVariable int id){
        return customerRepository.findById(id).get();
    }

    @GetMapping(value = "transaction/get")
    private List<Transaction> getTransactions(){
        return transactionRepository.findAll();
    }

    @PostMapping(value = "transaction/add")
    private Transaction addTransaction(@RequestBody Transaction transaction){
        return transactionRepository.save(transaction);
    }


    @GetMapping(value = "accounts/get")
    private List<Account> getAccounts(){
        return accountRepository.findAll();
    }

    @PostMapping(value = "account/add")
    private Account addAccount(@RequestBody Account account){
        return accountRepository.save(account);
    }


    @GetMapping(value = "emails/get")
    private List<Email_Tracking> getEmail(){
        return emailTrackingRepository.findAll();
    }

    @GetMapping(value = "titles/get")
    private List<Job_Title> getJobTitles(){
        return jobTitleRepository.findAll();
    }

    @GetMapping(value = "types/get")
    private List<Account_Type> getAccountTypes(){
        return accountTypesRepository.findAll();
    }

    @GetMapping(value = "transaction/type/get")
    private List<Transaction_type> getTransactionType(){
        return transactionTypeRepository.findAll();
    }

    @GetMapping(value = "branches/get")
    private List<Bank_Branch> getBranch(){
        return Bank_Branch_repo.getBranches();
    }

    @GetMapping(value = "departments/get")
    private List<Department> getDepartments(){
        return Department_Repos.findAll();
    }

}
