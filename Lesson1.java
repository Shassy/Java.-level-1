package Lesson1;

public class Lesson1 {
     public static void main (String[] args){
         char c='!';
         float a=17.5f;
         double d=28.5;
         byte b=10;
         short s=296;
         int i=6214;
         int k=88;
         int q = 2104;
         long l = 835653187;
         String st = "Vasya";

         System.out.println(summa(b,i,k,s));
         System.out.println(proverkaSumm(k,s));
         System.out.println(zero(-k));
         System.out.println(checkAboveZero(-i));
         System.out.println(hello(st,c));
         System.out.println(age(q));


     }
    static int summa(int a, int b, int c, int d) {

        int sum = a*(b+(c/d));
        return sum;
    }
    static boolean proverkaSumm(int x, int y) {
         int s = x+y;
         if (s>10 && s<20){
             return true;
         }
         else return false;
    }
    static String zero (int z) {
         if (z<0){
             return "Отрицательное";
         }
         else return "Положительное";
    }
    static boolean checkAboveZero (int z) {
        if (z<0){
          return true;
        }
        return false;
    }
    static String hello (String a,char c){
        String name = "Hello, " + a +c;
        return name;
    }
    static String age (int a) {
         if (a%4==0 && a%100!=0 || a%4==0 && a%400==0 ){
             return "Високосный";
         }
        else return "Не високосный";


    }
}
