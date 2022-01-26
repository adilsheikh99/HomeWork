package domashka.zadanie25;

public class main {
    public static void main(String[] args) {
        ATM atm=new ATM();
        System.out.println(atm.toString());
        atm.addDeneg(100,100,100);
        System.out.println(atm.toString());
        atm.getDeneg(270);
        System.out.println(atm);
    }
}
