package com.example;
import java.util.Scanner; //Will be used later

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime locaDate = LocalDateTime.now();
        int horas  = locaDate.getHour();
        int minutos = locaDate.getMinute();
        int segundos = locaDate.getSecond();
        System.out.println("Hora actual : " + horas  + ":"+ minutos +":"+segundos);
        System.out.println("Hello world!!!!!!!!!!!!!!!");
        System.out.println("Please, introduce your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hi "+name+"!");
    }
}