package ch06.lecture.p09encapsulation;

public class C02GetterSetter {
}

//field: private
// 필드값 변경(setter)/읽기(getter) 메소드를 public으로 작성

class MyClass02 {
    private int age;
    private String name;
    private String email;
    private String address;
    private boolean married;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    private boolean enabled;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public boolean isMarried() {
        return married;
    }

    public boolean isEnabled() {
        return enabled;
    }
}

//method: public
