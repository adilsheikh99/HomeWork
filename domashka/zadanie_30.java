package domashka;

import java.util.*;

public class zadanie_30 {
    public static void main(String[] args) {
        Random rnd=new Random();
        List<Integer> Numbers=new ArrayList<Integer>(22);
        for(int i=0;i<=10;i++){
            Numbers.add(rnd.nextInt(11));
        }
        System.out.println(Numbers);
        Set<Integer> set=new LinkedHashSet<Integer>(Numbers);
        System.out.println(set);
        }
    }

