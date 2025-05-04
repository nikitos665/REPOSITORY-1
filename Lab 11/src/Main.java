import java.util.Scanner;
class Person{
    private String Age;
    String Name;
    String Phone;
    Person(String Age, String Name, String Phone){
        this.Age = Age;
        this.Name = Name;
        this.Phone = Phone;
    }
    String getage (){
        return this.Age;
    }
}
class Student extends Person{
    public String Course;
    public String Faculty;
    private int Data;
    Student(String Age, String Name, String Phone, String Course, String Faculty, int Data){
        super(Age,Name,Phone);
        this.Course = Course;
        this.Faculty = Faculty;
        this.Data = Data;
    }
    int getData (){
        return this.Data;
    }


}
public class Main {
    public static void main(String[] args) {
        String Faculty;
        Scanner t = new Scanner(System.in);
        Student a = new Student("16","Григорий","89501205030","Русский язык","маетматический", 2024);
        Student b = new Student("18","Владислав","89684893467","Экономика","Экономический", 2022);
        Student c = new Student("17","Олег","8346275573","Математика","Термоядерный", 2023);
        Student [] mass = new Student[]{a,b,c};
        System.out.println("Список студентов:");
        for (int i = 0; i<3;i++){
        System.out.println((i+1)+" "+mass[i].Name+" "+mass[i].getage());
        }
        System.out.print("Введите интересующий вас факультет :");
        Faculty = t.next();
        for (int i = 0; i<3;i++){
            if(Faculty.equals(mass[i].Faculty)){
                System.out.println(mass[i].Name);
            }
        }
        System.out.print("Напишите интересующий вас год: ");
        int sravneni = t.nextInt();
        System.out.println("Cтуденты поступившие после " + sravneni+ " года: ");
        for (int i = 0; i<3; i++ )
        {
            int h = mass[i].getData();
            if (h > sravneni)
            {
                System.out.println(i+1+" "+mass[i].Name);
    }
}}}
//TIP Лабораторная работа № 11
//Создать класс Person с private полем возраст и public полями ФИО,
// Телефон. Создать класс-наследник Student с дополнительными public
// полями - Курс, Факультет и private полем дата поступления. Создать
// массив из трех объектов класса Student. Вывести: а)
// ФИО и возраст всех студентов б) список студентов заданного факультета;
// в) список студентов, поступивших после заданного года.




