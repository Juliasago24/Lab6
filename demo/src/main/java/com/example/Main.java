package com.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime locaDate = LocalDateTime.now();
int horas  = locaDate.getHour();
int minutos = locaDate.getMinute();
int segundos = locaDate.getSecond();
System.out.println("Hora actual : " + horas  + ":"+ minutos +":"+segundos);
    }
}