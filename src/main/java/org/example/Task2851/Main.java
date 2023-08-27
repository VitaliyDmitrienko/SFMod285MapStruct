package org.example.Task2851;

public class Main {
    public static void main(String[] args) {
        Department department = new Department();
        department.setId("s342");
        department.setName("Sales");

        Employee employee = new Employee();
        employee.setId("s343");
        employee.setLastName("Bond");
        employee.setDepartment(department);

        EmployeeMapper mapper = new EmployeeMapperImpl();
        EmployeeDTO employeeDTO = mapper.entityToDto(employee);
        System.out.println(employeeDTO);

    }
}
