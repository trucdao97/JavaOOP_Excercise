package excercise_01;

public class Information {
    public static void main(String[] args) {
        EmployeeTitle employeeTitle = new EmployeeTitle();
        Employee employee = new Employee("Truc Dao", 1234, "CanTho", "1997", "Dev01");
        System.out.println(employeeTitle.getEmployeeNameTitle() + ": " + employee.getEmployeeName());
        System.out.println(employeeTitle.getEmployeeIdTitle() + ": " + employee.getEmployeeId());
        System.out.println(employeeTitle.getEmployeeAddressTitle() + ": " + employee.getEmployeeAddress());
        System.out.println(employeeTitle.getEmployeeDepartmentTitle() + ": " + employee.getEmployeeDepartment());
        System.out.println("=======================================");

        Employee employee2 = new Employee("Miko", 4567, "CanTho", "2000", "Dev02");
        System.out.println(employeeTitle.getEmployeeNameTitle() + ": " + employee2.getEmployeeName());
        System.out.println(employeeTitle.getEmployeeIdTitle() + ": " + employee2.getEmployeeId());
        System.out.println(employeeTitle.getEmployeeAddressTitle() + ": " + employee2.getEmployeeAddress());
        System.out.println(employeeTitle.getEmployeeDepartmentTitle() + ": " + employee2.getEmployeeDepartment());
    }
}
