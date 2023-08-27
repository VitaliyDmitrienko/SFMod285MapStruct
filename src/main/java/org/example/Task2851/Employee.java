package org.example.Task2851;

public class Employee {
    private String id;

    private String lastName;

    private Department department;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{ \n" +
                "id = '" + id + "',\n" +
                "lastName = '" + lastName + "',\n" +
                "department = " + department + "'.\n" +
                '}';
    }
}
