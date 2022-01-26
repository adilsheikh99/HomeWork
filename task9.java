package sam;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
                count =count* array[i];
                System.out.println(count);
            }

        }

    }



