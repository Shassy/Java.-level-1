package Lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Lesson2 {
    public static void main(String[] args) {

// 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] mass10 = new int[arrayRand(5, 20)]; //Создаем массив произвольного объема от 5 до 20
        for (int i = 0; i < mass10.length; i++) {
            mass10[i] = arrayRand(0, 2); //заполняем его 0 и 1 в произовльном порядке
        }
        for (int mass : mass10) { // Проверяем чем заполнился массив
            System.out.print(mass + " ");
        }
        System.out.println();
        for (int j = 0; j < mass10.length; j++) {
            if (mass10[j] == 1) { //Заменяем 0 на 1 и наоборот
                mass10[j] = 0;
            } else mass10[j] = 1;
        }
        for (int mass : mass10) { //Проверяем результат
            System.out.print(mass + " ");
        }
        System.out.println();
        System.out.println();
// 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] mass8 = new int[8];
        for (int i = 0; i < mass8.length; i++) {
            mass8[i] = i * 3;
        }
        for (int mass : mass8) { // Проверяем чем заполнился массив
            System.out.print(mass + " ");
        }
        System.out.println();
        System.out.println();
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] massAny = new int[arrayRand(7, 25)]; //Создаем массив произвольного объема от 7 до 25
        for (int i = 0; i < massAny.length; i++) {
            massAny[i] = arrayRand(1, 15); //заполняем его произовольными числами от 1 до 15
        }
        for (int mass : massAny) { // Проверяем чем заполнился массив
            System.out.print(mass + " ");
        }
        System.out.println();
        for (int j = 0; j < massAny.length; j++) {
            if (massAny[j] < 6) { //Числа меньшие 6 умножаем на 2
                massAny[j] = 2 * massAny[j];
            }
        }
        for (int mass : massAny) { // Проверяем результат
            System.out.print(mass + " ");
        }
        System.out.println();
        System.out.println();
//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int len = arrayRand(7, 15);//Создаем массив произвольного объема от 7 до 15
        int[][] massAr = new int[len][len]; //Создаем массив
        int n = massAr.length; // создаем переменную для сравнения

        for (int i = 0; i < massAr.length; i++) { //Заполняем массив 0, а диагонали 1
            n--;
            for (int j = 0; j < massAr.length; j++) {

                if (j == i || j == n) {
                    massAr[i][j] = 1;
                } else massAr[i][j] = 0;
                System.out.print(massAr[i][j] + " "); //Выводим результат
            }
            System.out.println();
            System.out.println();
        }
//5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] massMinMax = new int[arrayRand(3, 20)]; //Создаем массив произвольного объема от 3 до 20
        int min;
        int max;
        for (int i = 0; i < massMinMax.length; i++) { //Заполняем массив
            massMinMax[i] = arrayRand(-5, 15);
            System.out.print(massMinMax[i] + " ");
        }
        System.out.println();
        min = massMinMax[0]; //Заполняем переменные max / min первым значением массива.
        max = massMinMax[0]; //
        for (int i = 1; i < massMinMax.length; i++) {
            if (massMinMax[i] < min) { //Если текущее значение в массиве меньше минимального, то присваиваем его в переменную min
                min = massMinMax[i];
            }
            if (massMinMax[i] > max) { //Если текущее значение в массиве больше максимального, то присваиваем его в переменную max
                max = massMinMax[i];
            }
        }
        System.out.println("Наибольший " + max);//Выводим результаты
        System.out.println("Наименьший " + min);
        System.out.println();
        System.out.println();
//6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят.
        int[] massCheck = new int[arrayRand(5, 10)]; //
        for (int i = 0; i < massCheck.length; i++) { //Создаем и заполняем массив произовольными значениями
            massCheck[i] = arrayRand(1, 10);
        }

        System.out.println(compare(massCheck));
        System.out.println();

//7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.

        int[] sdvigMass = new int[arrayRand(5, 12)];//Создаем массив произовольного размера
        int num = arrayRand(-3, 5); //Выбираем шаг сдвига. Специально беру небольшие числа, чтобы легче было отслеживать.
        for (int i = 0; i < sdvigMass.length; i++) {//Заполняем массив произовольными значениями
            sdvigMass[i] = arrayRand(1, 9);

        }
        System.out.println(Arrays.toString(sdvig(sdvigMass, num))); //При положительном числе сдвиг идет влево, при отрицательном вправо.
    }


    static int arrayRand(int min, int max) { //Метод для рандомного заполения массивов
        int random_number = min + (int) (Math.random() * max);
        return random_number;
    }

    static boolean compare(int[] massBo) { // Метод для сравнения сумм частей внутри массива
        System.out.println(Arrays.toString(massBo));
        int n = 0;
        int x = massBo[0];
        int y = 0;

        for (int i = 0; i < massBo.length - 1; i++) {
            n++;
            for (int j = n; j < massBo.length; j++) {
                y = y + massBo[j];
            }
            if (x == y) {
                return (true);
            }
            x = x + massBo[i + 1];
            y = 0;
        }
        return (false);
    }

    static int[] sdvig(int[] mass, int n) { //Метод для сдвига элементов массива на n
        System.out.println(Arrays.toString(mass));
        System.out.print(n);
        int a = 0;
        if (n >= 0) { //При положительном числе сдвиг идет влево, при отрицательном вправо.
            while (a < n) {
                int x = mass[0];
                for (int i = 1; i < mass.length; i++) {
                    mass[i - 1] = mass[i];
                }
                a++;
                mass[mass.length - 1] = x;
            }
            System.out.println();
            return mass;
        } else {
            while (a < -n) {
                int x = mass[mass.length - 1];
                for (int i = mass.length; i > 1; i--) {
                    mass[i - 1] = mass[i - 2];
                }
                a++;
                mass[0] = x;
            }
            System.out.println();
            return mass;
        }
    }

}
