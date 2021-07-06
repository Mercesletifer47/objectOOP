package ru.geekbrains.HomeWorkApp_lesson6;

public class Dog extends Animals {
    private final int max_RUN = 500;
    private final int max_Swim = 10;
    public static int numb=0;
    public Dog(String name, String color, int age){
        this.name= name;
        this.color= color;
        this.age= age;
        numb++;
        System.out.println("Собака № " + numb);
    }
    @Override
    public void run(int run) {
        if ((run >= 0) && (run <= max_RUN)){System.out.println(name + " пробежал "+ run);}
        else{System.out.println(name + "может пробежать максимум "+ max_RUN);}
    }
    @Override
    public void swim(int swim) {
        if ((swim >= 0) && (swim <= max_Swim)){System.out.println(name + " проплыл "+ swim);}
        else{System.out.println(name + "может проплыть максимум "+ max_Swim);}
    }
}
