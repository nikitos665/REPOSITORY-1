package com.company;
import java.util.Scanner;
import  java.util.Arrays;

class Reader {
    String fio;
    String bilet;
    String data;
    String phone;
    Reader(String fio, String bilet, String data, String phone){
        this.fio = fio;
        this.bilet = bilet;
        this.data = data;
        this.phone = phone;
    }
    void take_book(int n){
        System.out.printf("%s vzyal %d knig(i)",this.fio,n);System.out.println();
    }
    void take_book (String k){
        System.out.printf("%s vzyal %s",this.fio,k);
        System.out.println();
    }
    void return_book (int n){
        System.out.printf("%s wernul %d knig(i)",this.fio,n);
        System.out.println();
    }
    void return_book (String k){
        System.out.printf("%s wernul %s",this.fio,k);
        System.out.println();
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
	Reader A =  new Reader("dmitriy", "456","20.05.2001","89058475437");
	Reader B =  new Reader("vyacheslav", "456","20.05.2001","89058475437");
	Reader C =  new Reader("Nikita", "456","20.05.2001","89058475437");
	Reader D =  new Reader("sergey", "456","20.05.2001","89058475437");
	Reader E =  new Reader("yaroslav", "456","20.05.2001","89058475437");
	Reader [] mass = new Reader[]{A,B,C,D,E};
	System.out.println("kto beret knigu?: 1- dmitriy 2- vyacheslav 3- Nikita 4-sergey, 5-yaroslav");
	int r = a.nextInt()-1;
	System.out.println("skolko wzyali knig? :");
	int n = a.nextInt();
	mass[r].take_book(n);
	String[] s = new String[n];
	if (n>0){
        for (int i = 0; i< n; i++ ){
            System.out.println("kakuyu wzyali knigu: ");
            s[i] = a.nextLine();
        }
        mass[r].take_book(Arrays.toString(s));
    }
        System.out.println("skolko otdali?");
        int l = a.nextInt();
        mass[r].return_book(l);
        String[] p = new String[n];
        if (n>0){
            for (int i = 0; i< n; i++ ){
                System.out.println("kakutu otdali?");
                p[i] = a.nextLine();
            }
            mass[r].return_book(Arrays.toString(s));
        }



    }
}
