package learn.java.oop;

public class Main {

    public static void main(String[] args) {
        String str = "GeeeksforGeeks - A Computer Science Portal for Geeks";
        System.out.println(findAnswer(str));
    }

    private static String findAnswer(String str) {

        return str.replaceAll("(?i)[aeiou]", "");

    }
}



