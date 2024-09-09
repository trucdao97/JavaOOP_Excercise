package excercise_02_Person;

import excercise_01_Employee.EmployeeTitle;

public class Information {
    public static void main(String[] args) {
        EmployeeTitle employeeTitle = new EmployeeTitle();
        Person person1 = new Person("Truc Dao", 27, Gender.FEMALE, "Can Tho", "0910991991");
        System.out.println(employeeTitle.getEmployeeNameTitle() + ": " + person1.getName());
        System.out.println(employeeTitle.getEmployeeAgeTitle() + ": " + person1.getAge());
        System.out.println(employeeTitle.getEmployeeGenderTitle() + ": " + person1.genderDefine());
        System.out.println(employeeTitle.getEmployeeAddressTitle() + ": " + person1.getAddress());
        System.out.println(employeeTitle.getEmployeePhoneTitle() + ": " + person1.getPhone());
        System.out.println("======================");

        Person person2 = new Person("Miko", 10, Gender.MALE, "Can Tho", "0911991992");
        System.out.println(employeeTitle.getEmployeeNameTitle() + ": " + person2.getName());
        System.out.println(employeeTitle.getEmployeeAgeTitle() + ": " + person2.getAge());
        System.out.println(employeeTitle.getEmployeeGenderTitle() + ": " + person2.genderDefine());
        System.out.println(employeeTitle.getEmployeeAddressTitle() + ": " + person2.getAddress());
        System.out.println(employeeTitle.getEmployeePhoneTitle() + ": " + person2.getPhone());
        System.out.println("======================");
    }
}