package ru.geekbrains.HomeWorkApp_lesson6;

public class Animals {
    String name;
    String color;
    int age;
    int run;

    public void jump() {
        System.out.println(name + " jump!");
    }

    public void swim(int way) {
        System.out.println(name + " проплыл " + way);
    }

    public void run(int run) {
            System.out.println(name + " пробежал " + run);
        }
    public void info() {
            System.out.printf("%s %s %d\n", name, color, age);
        }
    }
