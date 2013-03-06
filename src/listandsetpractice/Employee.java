package listandsetpractice;

/**
 *
 * @author murbanski
 */
public class Employee {
    private String employeeId;
    private String name;
    private int departmentNumber;

    public Employee(String employeeId, String name, int departmentNumber) {
        this.employeeId = employeeId;
        this.name = name;
        this.departmentNumber = departmentNumber;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", name=" + name + ", departmentNumber=" + departmentNumber + '}';
    }
    
    

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }
    
    
}
