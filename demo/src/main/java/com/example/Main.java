package com.example;
import java.util.Scanner; //Will be used later

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Please, introduce your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hi "+name+"!");
    }
}