package excercise_02_Person;

import excercise_01_Employee.EmployeeTitle;

import java.util.ArrayList;

public class Company {
    public static void main(String[] args) {
        EmployeeTitle employeeTitle = new EmployeeTitle();
        Person person3 = new Person("Xuka", 10, Gender.FEMALE, "Japan", "0199111111");
//        person3.personInfo();
        Person person4 = new Person("Doraemon", 12, Gender.MALE, "Korea", "0199111112");
//        person4.personInfo();
        Person person5 = new Person("Chaien", 12, Gender.OTHER, "America", "0199111123");

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        for (Person person : personList){
            System.out.println("========");
            person.personInfo();
        }
    }
}
