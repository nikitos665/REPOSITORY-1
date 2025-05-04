import java.util.Scanner;class student {
    private String fio;    private int Data;    private String fakul;    private String Adress;    private String Phone;    private String Course;    student(String fio, int Data, String Fakul, String Adress, String Phone, String Course){
        this.fio = fio; this.Data = Data; this.fakul = Fakul; this.Adress = Adress; this.Data = Data; this.Phone = Phone; this.Course = Course;    }
    void setterfio (String str){
        this.fio = str;    }
    String getterfio (){
        return this.fio;    }
    void setfata (int inti){
        this.Data = inti;    }
    String getadres (){
        return this.Adress;    }
    void setterphone (String str){
        this.Phone = str;    }
    String getterphone (){
        return this.Phone;    }
    void settercourse (String str){
        this.Course = str;    }
    String getterfak (){
        return this.fakul;    }
    int getterdata (){
        return this.Data;    }
}
public class Main {
    public static void main(String[] args) {
        String fio = "";
        int Data = 0;
        String fakul = "";
        String Phone = "";
        String Course = "";
        Scanner mop = new Scanner(System.in);
        student a = new student(fio,Data,"Математический","Ул. Пушкина",Phone, Course);
        student b = new student(fio,Data,"Лингвистический","Ул. Саранцева",Phone, Course);
        student c = new student(fio,Data,"Туристический","Ул. Михайлова",Phone, Course);
        student [] mass = new student [] {a,b,c};
        for (int i = 0; i<3; i++ )
        {
            System.out.println("Vvedite imya studenta ");
            String n = mop.next();
            mass[i].setterfio(n);
            System.out.println("Vvedite datu postupleniya ");
            int k  = mop.nextInt();
            mass[i].setfata(k);
            System.out.println("Vvedite nomer telephona studenta ");
            n = mop.next();
            mass[i].setterphone(n);
            System.out.println("Vvedite KURS studenta ");
            n = mop.next();
            mass[i].settercourse(n);
        }
        System.out.println("Imena studentow: ");
        for (int i = 0; i<3; i++ )
        {
            String h = mass[i].getterfio();
            System.out.println(i+1 + " "+h);
        }
        System.out.println("Napishite interesuyushiy was fakultet");
        String sravnen = mop.next();
        System.out.println("Imena studentow nahodyashiesya na " + sravnen+" (om) fakultete: ");
        for (int i = 0; i<3; i++ )
        {
            String h = mass[i].getterfak();
            if (h.equals(sravnen)){
                h = mass[i].getterfio();
                System.out.println(i+1 + " "+h);
            }
        }
        System.out.println("Napishite interesuyushiy was god");
        int sravneni = mop.nextInt();
        System.out.println("Imena studentow postupivshie posle " + sravneni+ " goda: ");
        for (int i = 0; i<3; i++ )
        {
            int h = mass[i].getterdata();
            if (h > sravneni)
            {
                System.out.println(i+1+" "+mass[i].getterfio());
            }
        }
    }
}