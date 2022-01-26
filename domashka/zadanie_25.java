package domashka;


import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class zadanie_25 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

    }

    private static void dannie() {
        Random rnd = new Random();
        int kypurbi1 = 20;
        int kypurbi2 = 50;
        int kypurbi3 = 100;
        int bankomat = 500;
        int moySchet =300;
    }

    public static void popolnenieScheta(int bankomat,int moySchet) {
        System.out.println("хотите пополнить счет?(да/нет)");
        String a = scan.nextLine();
        if (Objects.equals(a, "да")) {
            System.out.println("введите сумму");
            int b = scan.nextInt();
            System.out.println("cумма на счёте " + (moySchet + b));
        } else if (Objects.equals(a, "нет")) {
            System.out.println("хотите снять деньги?(да/нет)");
            String c = scan.nextLine();
            if (Objects.equals(c, "да")) {
                System.out.println("введите сумму");
                int j = scan.nextInt();
                if (j < bankomat || j <= moySchet) {
                    System.out.println("каким номиналом выдать средства");
                } else if(j>bankomat||j>moySchet){
                        System.out.println("недостаточно средств");
                }
            }
        }
   }
}
