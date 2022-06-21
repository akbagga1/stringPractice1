package com.example.stringLearning.practice;

public class stringPractice {

    public static void main(String args[]) {
        String str = "Learn string handling";
        String allUpper = "LEARN STRING HANDLING";
        boolean isTrue = false;

        //This will return the first char of the string
        char ch1 = str.charAt(0);
        System.out.println("Index 0 is: " + ch1);

        char ch2 = str.charAt(1);
        System.out.println("Index 1 is: " + ch2);

        char ch3 = str.charAt(4);
        System.out.println("Index 4 is: " + ch3);

        //
        char ch4 = str.charAt(5);
        System.out.println("Index 5 is: " + ch4);

        char ch5 = str.charAt(10);
        System.out.println("Index 10 is: " + ch5);

        char ch6 = str.charAt(15);
        System.out.println("Index 15 is: " + ch6);

        //
        String str1 = str.toUpperCase();
        System.out.println(str1);

        //
        if (str.equalsIgnoreCase(allUpper)) {
            isTrue = true;
            System.out.println(true);
        } else {
            isTrue = false;
            System.out.println(false);
        }

        //
        int n = str.length();
        char last = str.charAt(n-1);
        char first = str.charAt(0);
        System.out.println(last);
        System.out.println(first);
        System.out.println(str.length());

        //
        if(ch5 == ch6) {
            System.out.println(true + " -Index 10 equals index 15");
        }else {
            System.out.println(false + " -Index 10 Does Not equals index 15");
        }

        //
        if(ch1 == ch4){
            System.out.println(false + " -Index 0 equals Index 5");
        }else{
            System.out.println(true + " -Index 0 does not equal Index 5");
        }


    }
}
