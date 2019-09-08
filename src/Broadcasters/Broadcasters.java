package Broadcasters;

public class Broadcasters {
    String id;
    String name;
    String email;
    int phone;
    String dir;
    Sex sex;
    String birthDay;

    public Broadcasters(String id, String name, String email, int phone, String dir, Sex sex, String birthDay){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dir = dir;
        this.sex = sex;
        this.birthDay = birthDay;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public String getDir() {
        return dir;
    }

    public Sex getSex() {
        return sex;
    }

    public String getBirthDay() {
        return birthDay;
    }
}
