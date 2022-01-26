package sam;

import java.lang.reflect.Array;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        int a=0;
        for (int i = 0; i < 4; i++) {
            a=n%10;
            n=n/10;
            System.out.print(a);
            }
        }
    }



