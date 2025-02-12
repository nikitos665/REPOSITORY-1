package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner tok = new Scanner(System.in);
        System.out.print("Введите количество чисел в массиве = ");
        int n = tok.nextInt();
        int []mass = new int[n]; System.out.println();
        for (int i = 0; i<n;i++){
            mass[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(mass));
        sortirovka(mass);
    }
    static void sortirovka (int mass[]){
        int j;
        for(int i=1;i<mass.length;i++){
            int tau = mass[i];
            for(j = i;j>0&&tau<mass[j-1];j--){
                mass[j]=mass[j-1];mass[j-1]=tau;
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
