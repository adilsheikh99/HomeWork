package Alishev;

import java.security.spec.RSAOtherPrimeInfo;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.name="oleg";
        person1.age=12;
        Person person2=new Person();
        person2.name="vania";
        person2.age=15;
        person1.speak();
        person2.speak();
        person1.sayHello();
    }

}

class Person{
String name;
int age;

    void sayHello(){
        System.out.println("Привет");
    }

void speak() {
    for (int i = 0; i < 3; i++) {
        System.out.println("меня зовут " + name + ",мне " + age + " лет");
    }


}
}

