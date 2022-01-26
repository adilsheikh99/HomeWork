package sam;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        if (a>=100&&a<1000){
            System.out.println("трехзначное");
        }else{
            System.out.println("число  не является  трехзначным");
        }if(a%10==7){
            System.out.println("последняя цифра 7");
        }else{
            System.out.println("последняя цифра не является 7");
        }if(a%2==0){
            System.out.println("четное");
        }else{
            System.out.println("нечетное");
        }
    }
}
