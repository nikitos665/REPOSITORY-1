import java.util.Scanner;
import java.util.Arrays;
class files{
    String name;
    int razmer;
    String data;
    int kolvo;
    files(String name, int razmer, String data, int kolvo){
        this.name = name;
        this.razmer = razmer;
        this.data = data;
        this.kolvo = kolvo;
    }
    void getInfo(){
        System.out.printf(" Название: %s; Вес: %d; Дата: %s Кол-во обращений: %d;",this.name,this.razmer,this.data,this.kolvo);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        files a = new files("Salam", 500, "01.01.2035", 0);
        files b = new files("privet", 800, "01.06.2012", 90);
        files c = new files("hello", 200, "21.01.2023", 40);
        files d = new files("yaray", 400, "01.05.2025", 54);
        files e = new files("miska", 300, "01.01.2024", 35);
        files[] mass = new files[]{a, b, c, d, e};
        System.out.println("Wwedite razmer fayla :");
        int k = p.nextInt();
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].razmer > k) {
                mass[i].getInfo();
            }
        }
        System.out.println("Введите кол во обращений : ");
        int r = p.nextInt();
        for (int j = 0; j < mass.length; j++) {
            if (mass[j].kolvo > r) {
                mass[j].getInfo();
            }
        }
    }
}
