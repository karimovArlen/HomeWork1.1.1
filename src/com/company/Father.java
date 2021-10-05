package com.company;

public class Father extends Grandfather {

    public Father(int age, String name, double height, Hobby hobby, Transport phone) {
        super(age, name, height, hobby, phone);
        age = 5;
    }

    public static void Ability(boolean boolaenDo) {
        if (boolaenDo == true) {
            System.out.println("He singing");
        } else if (!(boolaenDo)) {
            System.out.println("He doesn't want to sing");
        }
    }

    public static final void Ability(boolean boolaenDo, int minutes) {
        if (boolaenDo == true) {
            System.out.println("He dancing " + minutes + " minutes");
        } else {
            System.out.println("He doesn't dancing");
        }
    }

    public static void Ability(int age, boolean isHeFree) {
        if (age < 50 && age > 18) {
            if (isHeFree == true) {
                System.out.println("He is working");
            } else if (isHeFree == false) {
                System.out.println("He isn't work");
            }
        }
        if(age > 50 || age < 18){
            System.out.println("He isn't work");
        }
    }
}