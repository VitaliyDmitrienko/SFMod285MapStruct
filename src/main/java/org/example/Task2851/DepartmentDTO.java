package org.example.Task2851;

public class DepartmentDTO {
    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DepartmentDTO {\n" +
                "id='" + id + "',\n" +
                "name='" + name + "'.\n" +
                '}';
    }
}
