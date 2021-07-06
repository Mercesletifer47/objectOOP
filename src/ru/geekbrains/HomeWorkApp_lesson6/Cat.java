package ru.geekbrains.HomeWorkApp_lesson6;

public class Cat extends Animals {
    private final int max_RUN = 200;
    public static int numb=0;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        numb++;
        System.out.println("Количество созданных котов " + numb);
    }
    @Override
    public void swim(int way) {
        System.out.println(name + " не умеет плавать ");
    }
    @Override
    public void run(int run) {
        if ((run >= 0) && (run <= max_RUN)){System.out.println(name + " пробежал "+ run);}
        else{System.out.println(name + "может пробежать максимум "+ max_RUN);}
    }
}


