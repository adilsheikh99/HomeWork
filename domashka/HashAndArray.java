package domashka;

import java.util.*;

public class HashAndArray {
    private static Object ArrayList;

    public static void main(String[] args) {
        System.out.println("задание первое");
       hashToArray();
        System.out.println();
        arrayToHash();
        System.out.println("задание второе");
       hashOfKeys();
    }
    public static void hashToArray(){
        HashSet<String> hSet = new HashSet<String>();
        hSet.add("Кошка");
        hSet.add("Зубр");
        hSet.add("Медведь");
        hSet.add("Лиса");
        System.out.println("HashSet "+hSet);
        List<String> arrayList =new ArrayList<String >(hSet);
        System.out.println("ArrayList "+arrayList);
    }
    public static void arrayToHash(){
        List<String > arrayList=new ArrayList<String>();
        arrayList.add("Кошка");
        arrayList.add("Зубр");
        arrayList.add("Медведь");
        arrayList.add("Лиса");
        HashSet<String> hSet=new HashSet<>(arrayList);
        System.out.println("HashSet "+hSet);
        System.out.println("ArrayList "+arrayList);
    }
    public static void hashOfKeys(){
        Map<Integer,String> mapka=new HashMap<Integer,String>();
        mapka.put(1,"Toyota");
        Integer s= mapka.hashCode();
        mapka.put(2,"Mercedes");
        Integer g= mapka.hashCode();
        mapka.put(3,"Chevrolet");
        Integer f= mapka.hashCode();
        mapka.put(4,"Opel");
        Integer b= mapka.hashCode();
        System.out.println("хэшмапа "+mapka);
        HashSet<Integer> ciferki=new HashSet<Integer>();
        ciferki.add(s);
        ciferki.add(g);
        ciferki.add(f);
        ciferki.add(b);
        System.out.println("хэшКлючи из хэшМапы в хэшСете "+ciferki);
    }
}
