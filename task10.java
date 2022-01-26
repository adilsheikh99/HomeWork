package sam;

public class task10 {
    public static void main(String[] args) {
        int factorial = 0;
        int[] array=new int[5];
        for (int i=10;i<=15;i++){
            factorial= i + factorial;
            System.out.println(factorial);
        }
    }
}
