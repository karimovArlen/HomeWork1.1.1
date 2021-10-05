package com.company;

import java.util.Random;

public class Main {

    public static Random random = new Random();

    public static void main(String[] args) {
        Father objectFather = new Father(random.nextInt(50) + 20, "Ranch", 1.85, Hobby.SINGER, Transport.MERSEDES);
        Grandfather objectCris = new Grandfather(random.nextInt(100) + 10, "Cris", random.nextInt(200) + 1, Hobby.WRITER, Transport.BIKE);
        Son objectRobert = new Son(random.nextInt(20) + 1, "Robert", random.nextInt(200) + 1, Hobby.FOOTBALL, Transport.SIDAN);




        System.out.println("__________________");

        System.out.println(objectFather.getInfo());
        Father.Ability(random.nextBoolean());
        Father.Ability(random.nextBoolean(), random.nextInt(120) + 1);
        Father.Ability(random.nextInt(100) + 1, random.nextBoolean());

        System.out.println("__________________");

        System.out.println(objectCris.getInfo());
        Son.Ability(random.nextBoolean());
        Son.Ability(random.nextBoolean(), random.nextInt(120) + 1);
        Son.Ability(random.nextInt(100) + 1, random.nextBoolean());

        System.out.println("__________________");

        System.out.println(objectRobert.getInfo());
        Son.Ability(random.nextBoolean());
        Son.Ability(random.nextBoolean(), random.nextInt(120) + 1);
        Son.Ability(random.nextInt(100) + 1, random.nextBoolean());

        System.out.println("__________________");

    }
}