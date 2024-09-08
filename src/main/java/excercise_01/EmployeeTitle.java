package excercise_01;

public class EmployeeTitle {
    String employeeNameTitle;
    String employeeIdTitle;
    String employeeAddressTitle;
    String employeeDoBTitle;
    String employeeDepartmentTitle;

    public EmployeeTitle(){
        employeeNameTitle = "Tên Nhân Viên";
        employeeIdTitle = "Mã số nhân viên";
        employeeAddressTitle = "Địa chỉ";
        employeeDoBTitle = "Năm sinh";
        employeeDepartmentTitle = "Phòng ban";
    }

    public String getEmployeeNameTitle() {
        return employeeNameTitle;
    }

    public String getEmployeeIdTitle() {
        return employeeIdTitle;
    }

    public String getEmployeeAddressTitle() {
        return employeeAddressTitle;
    }

    public String getEmployeeDoBTitle() {
        return employeeDoBTitle;
    }

    public String getEmployeeDepartmentTitle() {
        return employeeDepartmentTitle;
    }
}
