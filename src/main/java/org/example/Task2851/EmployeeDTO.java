package org.example.Task2851;

public class EmployeeDTO {
    private String number;

    private String lastName;

    private DepartmentDTO departmentDto;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DepartmentDTO getDepartmentDto() {
        return departmentDto;
    }

    public void setDepartmentDto(DepartmentDTO departmentDto) {
        this.departmentDto = departmentDto;
    }

    @Override
    public String toString() {
        return "EmployeeDTO { \n" +
                "number = '" + number + "',\n" +
                "lastName = '" + lastName + "',\n" +
                "departmentDto = '" + departmentDto + "'.\n" +
                '}';
    }
}
