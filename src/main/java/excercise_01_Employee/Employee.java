package excercise_01_Employee;

public class Employee {
    String employeeName;
    int employeeId;
    String employeeAddress;
    String employeeBirthday;
    String employeeDepartment;

    public Employee(String employeeName, int employeeId, String employeeAddress, String employeeBirthday, String employeeDepartment){
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeAddress = employeeAddress;
        this.employeeBirthday = employeeBirthday;
        this.employeeDepartment = employeeDepartment;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public String getEmployeeBirthday() {
        return employeeBirthday;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }
}
