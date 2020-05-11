package com.pk.practice;


public class TestPractice01 {

    public static void MyMethod(String str) {

        int len = str.length();
        System.out.println("The Given String is " + str);

        str = str.trim();
        System.out.println("After Trim :" + str);

        String t = "";
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                t = t + ch;
            } else {
                System.out.print(Character.toUpperCase(t.charAt(0))
                        + ". ");
                t = "";
            }
        }

        String temp = "";

        for (int j = 0; j < t.length(); j++) {

            // first letter of surname in capital letter
            if (j == 0)
                temp = temp + Character.toUpperCase(t.charAt(0));

                // rest of the letters in small
            else
                temp = temp + Character.toLowerCase(t.charAt(j));
        }

        // printing surname
        System.out.println(temp);


    }

    public static void main(String[] args) {
        MyMethod("Prasanta Kumar Parida");
    }


}
