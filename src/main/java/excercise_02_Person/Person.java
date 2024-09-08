package excercise_02_Person;

public class Person {
    String name;
    int age;
    String gender;
    String address;
    String phone;

    public Person(String name, int age, String gender, String address, String phone){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public String genderDefine(){
        if (gender.equals("M")){
            return ("Male");
        } else if (gender.equals("F")){
            return ("Female");
        } else {
            return ("Other");
        }
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}
