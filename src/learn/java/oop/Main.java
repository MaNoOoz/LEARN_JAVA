package learn.java.oop;

public class Main {


    public static void main(String[] args) {
        String str = "zxzoOxz";
        System.out.println(findAnswer(str));
    }

    public static Boolean findAnswer(String str) {
        str = str.toLowerCase();
        return str.replace("o", "").length() == str.replace("x", "").length();



    }


}



