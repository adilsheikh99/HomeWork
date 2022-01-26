package sam;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите А");
        int a= scanner.nextInt();
        System.out.println("введите B");
        int b= scanner.nextInt();
        System.out.println("введите R");
        int square=a*b;
        int r= scanner.nextInt();
        double krug=r*3.14;
        if(krug>square){
            System.out.println("можно");

        }else{
            System.out.println("нельзя");
        }
    }
}
