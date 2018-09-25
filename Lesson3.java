package Lesson3;

//import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//import java.io.File;

import static java.lang.System.out;

public class Lesson3 {
    public static void main(String[] args) {

        Random rand = new Random();
        //  gameNum(rand.nextInt(10));
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        //gameWords(words[rand.nextInt(words.length - 1)]);



    }

    static void gameNum(int n) {
        Scanner sc = new Scanner(System.in);
        out.println(n);
        int a;
        int f;
        f = 3;

        do {
            out.print("Пожалуйста, введите число от 0 до 9 - ");
            a = sc.nextInt();
            if (a < n) {
                out.println("Загаданное число больше! Попробуйте еще раз!");
            } else if (a > n) {
                out.println("Загаданное число меньше! Попробуйте еще раз!");
            } else break;
            f--;
            System.out.println("Осталось " + f + " попыток");
        } while (f != 0 && a != n);
        if (a == n) {
            out.println("Вы победили!");
        } else out.println("Вы проиграли :(");
        System.out.println("Сыграем еще раз? 0=нет / 1=да");
        a = sc.nextInt();
        if (a == 1) {
            Random rand = new Random();
            gameNum(rand.nextInt(10));
        } else return;

    }

    static void gameWords(String word) {
        Scanner sc = new Scanner(System.in);
        System.out.println(word);
        String str;
        int check = 1;
        int c = word.length();
        int z;
        do {
            System.out.print("Введите ваш вариант слова - ");
            str = sc.next();
            z=str.length();
            System.out.println();
            int count;
            if (c>z){
                count = z;
            }else count = c;
            check = word.compareTo(str);

                for (int i = 0; i < count; i++) {
                    if (word.charAt(i) == str.charAt(i)) {
                        System.out.print(word.charAt(i));
                    } else System.out.print("#");

                }
            if (check != 0) {
            for (int i = 0; i <15-count ; i++) {
                System.out.print("#");

            }
                System.out.println();
           }

        } while (check != 0);
        return;
    }


}


