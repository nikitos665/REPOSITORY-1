class man{
    String name;
    String family;
    String data;
    man (String name, String family, String data){
       this.name = name;
       this.family = family;
       this.data = family;
    }
    void out(){
        System.out.printf("%s %s %s", this.name, this.family, this.data);
    }
    void gat(car a,book r){
        System.out.printf("%s читает книгу %s про машину %s", this.name, r.name, a.marka);
    }
}
class car{
    String marka;
    String god;
    String dvig;
    car (String marka, String god, String dvig){
        this.marka = marka;
        this.god = god;
        this.dvig = dvig;
    }
    void out(){
        System.out.printf("%s %s %s", this.marka, this.god, this.dvig);
    }
}
class book{
    String name;
    String after;
    String god;
    book (String name, String after, String god){
        this.name = name;
        this.after = after;
        this.god = god;
    }
    void out(){
        System.out.printf("%s %s %s", this.name, this.after, this.god);
    }
}

public class Main {
    public static void main(String[] args) {
        man a = new man("Антон","Ткачёвский","01.05.2001");
        car f = new car("ferari","2023","4 litr");
        book e = new book("Техническое устройство спорт каров", "Луковский А. В.", "2000");
        a.gat(f,e);
        }
    }