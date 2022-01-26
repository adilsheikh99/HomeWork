

import java.util.*;


public class zadanie_29 {
    public static void main(String[] args){
        List<Integer>listMarks=new ArrayList<>();
        Random rnd=new Random();
        for (int i = 0; i < 10; i++) {
            listMarks.add(rnd.nextInt(11));
        }
        System.out.println(listMarks);
        for (Iterator<Integer> it=listMarks.iterator();it.hasNext();){
            if(it.next()<4)
                it.remove();
        }
        System.out.println(listMarks);
    }
}
