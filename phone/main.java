package phone;

public class main {
    public static void main(String[] args) {

        phone phone1=new phone(80296034785L,"Xiaomi",672.21,"Adil");
        phone phone2=new phone(80445562801L,"Samsung",752.33,"Alex");
        phone phone3=new phone(80339627893L,"Nokia",591.26,"Andrei");
        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());
        phone1.receiveCall();
        phone2.receiveCall();
        phone3.receiveCall();
        phone1.receiveCall("Adil",80296034785L );
        phone2.receiveCall("Alex",80445562801L);
        phone3.receiveCall("Andrei",80339627893L);


    }


}
