package domashka.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<Student> listMarks=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
            for( int i=0;i<10;i++){
                System.out.println("введите имя студента");
                Student student=new Student(scanner.next(), scanner.nextInt());
                listMarks.add(student);
            }
    }
}
