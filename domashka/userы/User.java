package domashka.userы;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class User {
    private long id;
    private String name;
    private int age;
    private char sex;
     List<String> action=new ArrayList<String>();

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex;
    }

    public User(long id, String name, int age, char sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex=sex;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(){
        this.sex=sex;
    }

    public  String userAction(int numbers) {
        switch (numbers) {
            case 1:
                return "проснулся";
            case 2:
               return "сделал кофе,посмотрел в окно";
            case 3:
                return "сходил по нужде";
            case 4:
                return "пошел на работу";
                default:return "спит";
        }
    }
}
