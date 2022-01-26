package library;

public class main {
    public static void main(String[] args) {
        Reader reader1=new Reader("Adil",1,"nano biology",30_06_1999,80296034785L);
        Reader reader2=new Reader("Alex",2,"psiholoogist",28_08_1989,80293482963L);
        reader1.takeBook();
        reader2.takeBook();
    }
}
