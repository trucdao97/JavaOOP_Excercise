package excercise_01_Employee;

public class EmployeeTitle {
    String employeeNameTitle;
    String employeeIdTitle;
    String employeeAddressTitle;
    String employeeDoBTitle;
    String employeeDepartmentTitle;
    String employeePhoneTitle;
    String employeeGenderTitle;
    String employeeAgeTitle;

    public EmployeeTitle(){
        employeeNameTitle = "Tên Nhân Viên";
        employeeIdTitle = "Mã số nhân viên";
        employeeAddressTitle = "Địa chỉ";
        employeeDoBTitle = "Năm sinh";
        employeeDepartmentTitle = "Phòng ban";
        employeePhoneTitle = "Số điện thoại";
        employeeGenderTitle = "Giới tính";
        employeeAgeTitle = "Số tuổi";
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

    public String getEmployeePhoneTitle() {
        return employeePhoneTitle;
    }

    public String getEmployeeGenderTitle() {
        return employeeGenderTitle;
    }

    public String getEmployeeAgeTitle() {
        return employeeAgeTitle;
    }
}
