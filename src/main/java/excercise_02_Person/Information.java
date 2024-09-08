package excercise_02_Person;

import excercise_01_Employee.EmployeeTitle;

public class Information {
    public static void main(String[] args) {
        EmployeeTitle employeeTitle = new EmployeeTitle();
        Person person = new Person("Truc Dao", 27, "F", "Can Tho", "0910991991");
        System.out.println(employeeTitle.getEmployeeNameTitle() + ": " + person.getName());
        System.out.println(employeeTitle.getEmployeeAgeTitle() + ": " + person.getAge());
        System.out.println(employeeTitle.getEmployeeGenderTitle() + ": " + person.genderDefine());
        System.out.println(employeeTitle.getEmployeeAddressTitle() + ": " + person.getAddress());
        System.out.println(employeeTitle.getEmployeePhoneTitle() + ": " + person.getPhone());
        System.out.println("======================");

        Person person1 = new Person("Miko", 10, "O", "Can Tho", "0911991992");
        System.out.println(employeeTitle.getEmployeeNameTitle() + ": " + person1.getName());
        System.out.println(employeeTitle.getEmployeeAgeTitle() + ": " + person1.getAge());
        System.out.println(employeeTitle.getEmployeeGenderTitle() + ": " + person1.genderDefine());
        System.out.println(employeeTitle.getEmployeeAddressTitle() + ": " + person1.getAddress());
        System.out.println(employeeTitle.getEmployeePhoneTitle() + ": " + person1.getPhone());
        System.out.println("======================");
    }
}