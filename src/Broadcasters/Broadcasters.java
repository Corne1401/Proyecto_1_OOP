package Broadcasters;

public class Broadcasters {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String dir;
    private Sex sex;
    private String birthDay;

    public Broadcasters(String id, String name, String dir, String birthDay){
        this.id = id;
        this.name = name;
        this.dir = dir;
        this.birthDay = birthDay;

    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDir() {
        return dir;
    }
    public void setDir(String dir) {
        this.dir = dir;
    }

    public Sex getSex() {
        return sex;
    }
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }


}
