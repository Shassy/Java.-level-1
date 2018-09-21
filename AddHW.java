package Lesson2;

public class AddHW {
    public static void main(String[] args){
        String str = "Hello World!";
        StringBuffer strBuf = new StringBuffer(str);
        int n = strBuf.length();
        //char c ='';
       // System.out.println(n);
        while (n>0) {
            char c= strBuf.charAt(n-1);
            System.out.print(c);
            n--;
        }
    }
}
