package bookshop.backend.mapper;

import bookshop.backend.DTO.EmployeeDTO;
import bookshop.backend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDTO mapEmployeeToEmployeeDTO(Employee employee) {
        return new EmployeeDTO(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapEmployeeDTOToEmployee(EmployeeDTO employeeDTO) {
        return new Employee(
                employeeDTO.getId(),
                employeeDTO.getFirstName(),
                employeeDTO.getLastName(),
                employeeDTO.getEmail()
        );
    }
}
