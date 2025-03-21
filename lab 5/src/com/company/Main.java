package com.company;
import java.util.Scanner;
import java.util.Arrays;
class digital {
    double primer_first(double x) {
        double y;
        y = 3 * x + 5;
        return y;
    }

    double primer_second(double a, double b) {
        double y;
        double k = a - b;
        if (k != 0) {
            y = (a + b) / k;
            return y;
        } else {
            System.out.println("На ноль делить нельзя");
        }
        return 0;
    }

    double primer_third(double a, double b, double x) {
        double y;
        double s = 1;
        if (b != 0) {
            y = a * x / b;
            for (double i = 1; i <= y; i++) {
                s = s * i;
            }
        } else {
            System.out.println("На ноль делить нельзя");
        }
        y = s;
        return y;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пример который хотите решать (1, 2, 3) = ");
        int n = in.nextInt();
        digital primer1 = new digital();digital primer2 = new digital();digital primer3 = new digital();
        switch (n) {
            case 1:
                System.out.println("Введите X");
                double x = in.nextInt();
                System.out.println(primer1.primer_first(x));break;
            case 2:System.out.println("Введите A");
                double a = in.nextInt();System.out.println("Введите B");
                double b = in.nextInt();System.out.println(primer2.primer_second(a,b));break;
            case 3:System.out.println("Введите A");
                a = in.nextInt();System.out.println("Введите B");
                b = in.nextInt();System.out.println("Введите X");
                x = in.nextInt();System.out.println(primer3.primer_third(a,b,x));break;
            default:System.out.println("Данного пункта не существует");
    }
}
}

