import java.util.Scanner;
class animal{
    String food;
    String location;
    animal (String food, String location){
        this.food = food;
        this.location = location;
    }
    void makenoise (String name){
        System.out.println(name+ " издаёт такой то звук");
    }
    void eat (String name){
        System.out.println(name+ " кушает");

    }
    void sleep (String name){
        System.out.println(name+ " спит");

    }
}
class dog extends animal {
    String klichka;
    dog(String klichka ,String poroda,String food, String location){
        super(food, location);
        this.klichka = klichka;
    }
    @Override
    void makenoise (String klichka){
        System.out.println("Собака "+klichka + " лает");

    }
    @Override
    void eat (String name){
        System.out.println("Собака кушает "+ name);

    }
    @Override
    void sleep (String name){
        System.out.println(name+ " спит");

    }
}
class cat extends animal {
    String klichka;
    String cwet;
    cat(String klichka ,String cwet,String food, String location){
        super(food, location);
        this.klichka = klichka;
        this.cwet = cwet;
    }
    @Override
    void makenoise (String klichka){
        System.out.println("Кошка "+klichka + " мяукает");

    }
    @Override
    void eat (String name){
        System.out.println("Кошка кушает "+ name);

    }
    @Override
    void sleep (String name){
        System.out.println(name+ " спит");

    }
}
class hourse extends animal {
    String klichka;
    String cwetgrivi;
    hourse(String klichka ,String cwetgrivi,String food, String location){
        super(food, location);
        this.klichka = klichka;
        this.cwetgrivi = cwetgrivi;
    }
    @Override
    void makenoise (String klichka){
        System.out.println("Лошадь "+klichka + " топает ногами");

    }
    @Override
    void eat (String name){
        System.out.println("Лошадь кушает "+ name);

    }
    @Override
    void sleep (String name){
        System.out.println(name+ " спит");

    }
}
class vet{
    void vetir (animal a,String name){
        char lastChar = a.location.charAt(a.location.length()- 1);
        if (lastChar == 'а')
        System.out.println(name+ " пришёл к ветеринару он ест "+ a.food +" и живёт в " + a.location.replace('а','e'));
        else
            System.out.println(name+ " пришёл к ветеринару он ест "+ a.food +" и живёт в " + a.location+"e");
    }
}

public class Main {
    public static void main(String[] args) {
        dog a = new dog ("Шарик", "Немецая овчарка","кость","будка");
        cat b = new cat("Мурзик", "белый", "корм", "дом");
        hourse c = new hourse("Дун", "коричневый", "яблоки", "загон");
        a.eat(a.food);
        a.sleep(a.klichka);
        a.makenoise(a.klichka);
        b.eat(b.food);
        b.sleep(b.klichka);
        b.makenoise(b.klichka);
        c.eat(c.food);
        c.sleep(c.klichka);
        c.makenoise(c.klichka);
        vet vet = new vet();
        vet.vetir(a,a.klichka);
        vet.vetir(b,b.klichka);
        vet.vetir(c,c.klichka);

    }
    }
