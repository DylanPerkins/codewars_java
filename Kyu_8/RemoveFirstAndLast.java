package Kyu_8;

public class RemoveFirstAndLast {
    public static void main(String[] args) {
        System.out.println(remove("Hello"));


    }

    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }
}
