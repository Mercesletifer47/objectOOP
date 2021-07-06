package ru.geekbrains.HomeWorkApp_lesson6;
//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
// Результатом выполнения действия будет печать в консоль.
// (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.
public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("barsik", "red", 5);
        cat.info();
        cat.jump();
        cat.swim(150);
        cat.run(200);

        Cat cat2 = new Cat("pushok", "black", 2);
        cat2.info();

        Dog dog = new Dog("Tuzik", "blu", 3);
        dog.info();
        dog.jump();
        dog.swim(10);
        dog.run(500);

        Dog dog2 = new Dog("Grelka", "white", 1);
        dog2.info();

        System.out.println("Количество созданных животных " + (Cat.numb+Dog.numb));


    }
}
