package com.example.EmpManagementSystem.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class EmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository){
        return args -> {
            Employee sunil = new Employee(
                    1L,
                    "Sunil",
                    "sunil@gmail.com",
                    LocalDate.of(2000, JANUARY, 3)

            );

            Employee kamal = new Employee(
                    "Kamal",
                    "kamal@gmail.com",
                    LocalDate.of(2000, FEBRUARY, 9)
            );

            employeeRepository.saveAll(
                    List.of(sunil, kamal)
            );
        };
    }
}
