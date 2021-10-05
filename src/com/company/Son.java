package com.company;

public final class Son extends Father{
    public Son(int age, String name, double height, Hobby hobby, Transport phone) {
        super(age, name, height, hobby, phone);
    }

    public static void Ability(int age, boolean isHeFree) {
        if (age < 50 && age > 18) {
            if (isHeFree == true) {
                System.out.println("He is playing");
            } else if (isHeFree == false) {
                System.out.println("He isn't playing");
            }
        }
        if(age > 50 || age < 18){
            System.out.println("He isn't running");
        }
    }
}