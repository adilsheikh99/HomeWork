package domashka.student;

public class Student {
    String name;
    int marks;


    public Student(String next, int nextInt) {
        this.name=name;
        this.marks=marks;
    }
    public Student(){

    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public int getMark(){
        return marks;
    }
    public void setMark(int marks){
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
