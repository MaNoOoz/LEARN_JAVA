package learn.java.oop;

public class Main {


    public static void main(String[] args) {
        String str = "zxzoOxz";
        System.out.println(findAnswer(str));
    }

    public static Boolean findAnswer(String str) {
        int numOfO = 0;
        int numOfX = 0;
        String s = str.toLowerCase();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            switch (ch[i]) {
                case 'o':
                    numOfO++;
                    break;
                case 'x':
                    numOfX++;
                    break;
            }
        }
        System.out.println("The Number Of O's Is " + numOfO + "");
        System.out.println("The Number Of X's Is " + numOfX + "");
        int total = numOfO + numOfX;

        if (numOfO == numOfX && total > 2) {
            System.out.println(s);
            return true;

        } else if (total == 0) {
            System.out.println(s);
            return true;
        } else
            System.out.println(s);
        return false;


    }


}



