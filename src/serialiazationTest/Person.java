package serialiazationTest;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1l;
    static String country = "ITALY";
    private int age;
    private String name;
    transient int height;

    public static void setCountry(String country) {
        Person.country = country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }
}
