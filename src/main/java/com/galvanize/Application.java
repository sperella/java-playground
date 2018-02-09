package com.galvanize;

public class Application {


    static String grade(String score) {
        // Implement your solution
        if (Integer.parseInt(score) >= 90) return("A");
        else if (Integer.parseInt(score) >= 80) return("B");
        else if (Integer.parseInt(score) >= 70) return("C");
        else if (Integer.parseInt(score) >= 60) return("D");
        else return("F");
    }


    public static void main(String[] args) {

        Application object = new Application();

        System.out.println(grade("95"));
        System.out.println(grade("85"));
        System.out.println(grade("75"));
        System.out.println(grade("65"));
        System.out.println(grade("55"));

    }

}
