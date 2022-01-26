package sam;

import java.util.Random;

public class task13 {
    public static void main(String[] args) {
        Random random=new Random();
        int[] array=new int[10];
        for(int i=0;i<= array.length;i++){
            array[i]= random.nextInt(9);
            System.out.println(array[i]);
        }
    }
}
