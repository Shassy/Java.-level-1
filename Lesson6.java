package Lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Кот", 200, 5, 0);
        Dog dog1 = new Dog("Пёс1", 500, 1, 10);
        Dog dog2 = new Dog("Пёс2", 400, 1, 15);
        cat1.animalInfo();
        dog1.animalInfo();
        dog2.animalInfo();
//        cat1.run (100);
//        cat1.jump (2);
//        cat1.swim(2);

    }


}