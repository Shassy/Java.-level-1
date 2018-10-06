package Lesson6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

abstract class Hero {
    protected int health;
    protected String name;
    protected int damage;
    protected int heal;
    protected int buff;

    public Hero(int health, String name, int damage, int heal) {
        this.health = health;
        this.name = name;
        this.damage = damage;
        this.heal = heal;
        this.buff = buff;
    }

    abstract void hit(Hero hero);

    abstract void healing(Hero hero);

    void causeDamage(int damage) {
        health -= damage;
    }

    void addHealth(int heal) {
        health += heal;
    }

    void warBuff(int buff) {
        if (buff == 1) {
            health += 100;
        }
    }

    void ddBuff(int buff) {
        if (buff == 1) {
            damage += 50;
        }
    }

    void healBuff(int buff) {
        if (buff == 1) {
            health += 50;
            damage += 15;
        }
    }

    abstract void buffer(Hero hero);

    void info() {
        System.out.println(name + " " + health + " " + damage + " " + heal + " " + buff);
    }

}


class Warrior extends Hero {

    public Warrior(int health, String name, int damage, int heal) {
        super(health, name, damage, heal);
    }

    @Override
    void hit(Hero hero) {
        if (hero != this) {
            hero.causeDamage(damage);
        }
    }

    @Override
    void healing(Hero hero) {
        System.out.println("Воины не умеют лечить!");
    }

    @Override
    void buffer(Hero hero) {
        hero.warBuff(buff);
    }
}

class DamageDealer extends Hero {

    public DamageDealer(int health, String name, int damage, int heal) {
        super(health, name, damage, heal);
    }

    @Override
    void healing(Hero hero) {
        System.out.println("Воины не умеют лечить!");

    }

    @Override
    void buffer(Hero hero) {
        ddBuff(buff);
    }

    @Override
    void hit(Hero hero) {
        if (hero != this) {
            hero.causeDamage(damage);
        }


    }
}

class Healler extends Hero {
    public Healler(int health, String name, int damage, int heal) {
        super(health, name, damage, heal);
    }

    @Override
    void buffer(Hero hero) {
        healBuff(buff);
    }

    @Override
    void hit(Hero hero) {
        System.out.println("Хиллер не умеет бить!");
    }

    @Override
    void healing(Hero hero) {
        hero.addHealth(heal);
    }
}

class Game {
    public static void main(String[] args) {
        Hero[] heroes1 = new Hero[3];
        Hero[] heroes2 = new Hero[3];


        heroes1[0] = new Warrior(150, "Тигрил", 50, 0);
        heroes1[1] = new Healler(120, "Рафаэль", 0, 70);
        heroes1[2] = new DamageDealer(100, "Зилонг", 95, 0);
        heroes2[0] = new Warrior(190, "Минотавр", 60, 0);
        heroes2[1] = new Healler(80, "Одэтта", 0, 50);
        heroes2[2] = new DamageDealer(90, "Фаша", 105, 0);
        fight(heroes1, heroes2);


//        heroTigril.info();
//        heroMinotavr.info();
//        heroZilong.info();
//
//        heroMinotavr.hit(heroTigril);
//        heroTigril.hit(heroMinotavr);
//        heroZilong.hit(heroMinotavr);
//        heroTigril.healing(heroMinotavr);
//
//        heroTigril.info();
//        heroMinotavr.info();
//        heroZilong.info();
    }

    private static void fight(Hero[] heroes1, Hero[] heroes2) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        char a = ' ';
        do {
            for (int i = 0; i < heroes1.length; i++) {
                heroes1[i].info();

            }
            System.out.println();

            for (int i = 0; i < heroes1.length; i++) {
                heroes2[i].info();

            }


            int hit = rand.nextInt(2);//Будет удар или нет
            int buf = rand.nextInt(2);//Будет баф или нет
            int he = rand.nextInt(2);//Будет лечение или нет
            int h1 = rand.nextInt(3);//Для какого воина 1-й команды применять навыки
            int h2 = rand.nextInt(3);//Для какого воина 2-й команды применять навыки


            if (hit == 1) {
                heroes1[h1].hit(heroes2[h2]);
                heroes2[h1].hit(heroes1[h2]);
            } else if (he == 1) {
                heroes1[h1].healing(heroes1[h2]);
                heroes2[h1].healing(heroes2[h2]);
            } else if (buf == 1) {
                heroes1[h1].buffer(heroes1[h2]);
                heroes2[h1].buffer(heroes2[h2]);
            }

            System.out.println("------------------------");
        } while (heroes1[0].health > 0 && heroes2[0].health > 0 && heroes1[1].health > 0 && heroes2[1].health > 0 && heroes1[2].health > 0 && heroes2[2].health > 0);

//            if (heroes1[0] < 0)
//            {
//                System.out.println("Первая комманда проиграла");
//            }
//            if (heroes2[0] < 0)
//            {
//                System.out.println("Вторая комманда проиграла");
//            }
//            System.out.println("Следующий тур боя? Y/N ");
//            a = sc.next();
//            if (a == 'Y' || a == 'y')
//            {
//               fight (Hero[] heroes1, Hero[] heroes2)
//            } else return;
    }


//    public void fight(mass1[3], mass2[3]) {
//
//    }
}


