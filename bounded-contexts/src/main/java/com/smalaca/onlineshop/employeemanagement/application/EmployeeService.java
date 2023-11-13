package com.smalaca.onlineshop.employeemanagement.application;

import com.smalaca.onlineshop.employeemanagement.domain.EmployeeAccount;
import com.smalaca.onlineshop.employeemanagement.domain.EmployeeRepository;

public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void create(EmployeeDto dto) {
        EmployeeAccount employeeAccount = asUserAccount(dto);

        employeeRepository.save(employeeAccount);
    }

    private EmployeeAccount asUserAccount(EmployeeDto dto) {
        return null;
    }
}
