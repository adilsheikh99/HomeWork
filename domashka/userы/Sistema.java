package domashka.userы;

import java.util.*;

public class Sistema {
    static Map<User,List<String>> chelik =new HashMap<User,List<String>>();
    static List<User> users=new ArrayList<>();
    public static void main(String[] args) {

        User adil = new User(1, "Adil", 22, 'm');
        User alex = new User(2, "Alex", 15, 'm');
        User vasija = new User(3, "Vasija", 16, 'm');
        User masha = new User(4, "Masha", 23, 'f');
        User igor = new User(5, "Igor", 22, 'm');
        users.add(adil);
        users.add(alex);
        users.add(vasija);
        users.add(masha);
        users.add(igor);

        Sistema.chelik.put(adil,adil.action);
        chelik.put(alex,alex.action);
        chelik.put(vasija,vasija.action);
        chelik.put(masha,masha.action);

        System.out.println("Добавляем и выводим всех пользователей:");
        adil.action.add(adil.userAction(1));
        adil.action.add(adil.userAction(2));
        adil.action.add(adil.userAction(3));
        alex.action.add(alex.userAction(1));
        alex.action.add(alex.userAction(2));
        alex.action.add(alex.userAction(4));
        vasija.action.add(vasija.userAction(1));
        vasija.action.add(vasija.userAction(3));
        masha.action.add(masha.userAction(1));
        masha.action.add(masha.userAction(2));


        System.out.println(adil.toString()+chelik.get(adil));
        System.out.println(alex.toString()+chelik.get(alex));
        System.out.println(vasija.toString()+chelik.get(vasija));
        System.out.println(masha.toString()+chelik.get(masha));

        System.out.println("Удаляем действия пользователей:");
        chelik.remove(adil,adil.action);
        chelik.remove(alex,alex.action);
        chelik.remove(vasija,vasija.action);
        chelik.remove(masha,masha.action);
        chelik.remove(igor,igor.action);

        System.out.println(chelik);

        System.out.println("Удаляем пользователей:");
        users.remove(adil);
        users.remove(alex);
        users.remove(vasija);
        users.remove(masha);
        users.remove(igor);
        System.out.println(users);

        System.out.println("все действия по пользователю Адиль:");
        System.out.println(adil.action);
    }
}
