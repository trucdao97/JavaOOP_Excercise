package excercise_02_Person;

import excercise_01_Employee.EmployeeTitle;

public class Person {
    String name;
    int age;
    Gender gender;
    String address;
    String phone;

    public Person(String name, int age, Gender gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public String genderDefine() {
        switch (gender) {
            case FEMALE: {
                return "Nữ";
            }
            case MALE: {
                return "Nam";
            }
            default: {
                return "Khác";
            }
        }
    }

    public Person() {

    }

    public void personInfo(){
        EmployeeTitle employeeTitle = new EmployeeTitle();
        System.out.println(employeeTitle.getEmployeeNameTitle() + ": " + name);
        System.out.println(employeeTitle.getEmployeeAgeTitle() + ": " + age);
        System.out.println(employeeTitle.getEmployeeGenderTitle() + ": " + genderDefine());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}
