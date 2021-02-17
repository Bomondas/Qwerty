package example;


import java.io.CharArrayWriter;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Арифметичсекие операции над значениями типа double
        System.out.println("Арифметика с плавающей точкой");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - da;
        double de = - dd;
        System.out.println("da " +da);
        System.out.println("db " +db);
        System.out.println("dc " +dc);
        System.out.println("dd " +dd);
        System.out.println("de " +de);
    }
}