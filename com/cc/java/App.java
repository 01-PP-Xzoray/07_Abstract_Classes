package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Rectangle rectangle = new Rectangle(10, 10);
        output("------ Flächen ------");
        output("Fläche Rechteck: " + rectangle.area());
    }

  

   


    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

