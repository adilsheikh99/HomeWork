package domashka;

public class zadanie_20 {
    public static void main(String[] args) {
        String str = new String();
        String str2 = new String();
        char symbol;
        str = "вечером я люблю гулять по городу и любоваться закатами.";
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ' ' || symbol == '.') {
                System.out.println(str.charAt(i - 1));
            }
        }
    }
}

