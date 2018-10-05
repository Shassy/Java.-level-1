package Lesson6;

abstract public class Animal {
    protected int run;
    protected int jump;
    protected int swim;
    protected String name;

    public Animal(String name, int run, int jump, int swim) {
        this.name = name;
        this.run = run;
        this.jump = jump;
        this.swim = swim;
    }
//    abstract void run (Animal animal);
//    abstract void jump (Animal animal);
//    abstract void swim (Animal animal);
    public void animalInfo (){
        System.out.printf("%s может пробежать %d метров, прыгнуть на %d метров и проплыть %d ", name, run, jump, swim);
        System.out.println();
    }

}
class Cat extends Animal {
    public Cat(String name, int run, int jump, int swim) {
        super(name, run, jump, swim);
        this.name = "Кот";
//        public void catSwim (Animal swim){
//            if (this.swim > 0) {
//                System.out.println("Кот не умеет плавать!");
//            }

        }    }
//}
//    @Override
//    void run(int a) {
//        System.out.printf("Кот может пробежать %d метров", a);
//    }
//
//    @Override
//    void jump(int z) {
//        System.out.printf("Кот может прыгнуть на %d метров", z);
//    }
//
//    @Override
//    void swim(int s) {
//        System.out.println("Кот не умеет плавать!");
//    }


class Dog extends Animal {
    public Dog(String name, int run, int jump, int swim) {
        super(name, run, jump, swim);
       // this.name = "Пёс";
    }
}

//    @Override
//    void run(int a) {
//        System.out.printf("Пес может пробежать %d метров", a);
//    }
//
//    @Override
//    void jump(int z) {
//        System.out.printf("Пес может прыгнуть на %d метров", z);
//    }
//
//    @Override
//    void swim(int s) {
//        System.out.printf("Пес может проплыть %d метров", s);
//    }


