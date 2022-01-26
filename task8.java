package sam;

import java.util.Random;

public class task8 {
    public static void main(String[] args) {
        Random rnd=new Random();
        int a= rnd.nextInt(100);
        if(a%10==1){
            System.out.println(a+" рубль");
        }if(a%10==2||a%10==3||a%10==4){
            System.out.println(a+" рубля");
        }if(a%10==5||a%10==6||a%10==7||a%10==8||a%10==9||a%10==0){
            System.out.println(a+" рублей ");
        }
    }
}
