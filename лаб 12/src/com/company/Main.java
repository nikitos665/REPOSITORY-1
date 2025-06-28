package com.company;
interface tovar {
    String nazvan();
    String zena();
    String reting();
}
interface user {
    String login();
    String password();
}
class user1 implements user {
    String password;
    String login;
    user1 (String name, String password, String login){
        this.login = login;
        this.password = password;
    }
    public String login(){
        return this.login;
    }

    @Override    public String password() {
        return this.password;    }
}
class user2 implements user {
    String password;
    String login;
    user2 (String name, String password, String login){
        this.login = login;
        this.password = password;
    }
    public String login(){
        return this.login;
    }

    @Override    public String password() {
        return this.password;    }
}
class user3 implements user {
    String password;
    String login;
    user3 (String name, String password, String login){
        this.login = login;
        this.password = password;
    }
    public String login(){
        return this.login;
    }

    @Override    public String password() {
        return this.password;
    }
}
class magazine implements tovar {
    String nazvanie;
    String zena;
    String reting;
    magazine (String nazvan, String zena, String reting){
        this.nazvanie = nazvan;
        this.zena = zena;
        this.reting = reting;
    }
    @Override    public String nazvan() {
        return this.nazvanie;
    }
    @Override    public String zena(){
        return this.zena;
    }
    @Override    public String reting(){
        return this.reting;
    }
}
class supermarket implements tovar {
    String nazvanie;
    String zena;
    String reting;
    supermarket (String nazvan, String zena, String reting){
        this.nazvanie = nazvan;
        this.zena = zena;
        this.reting = reting;
    }
    @Override    public String nazvan() {
        return this.nazvanie;
    }
    @Override    public String zena(){
        return this.zena;
    }
    @Override    public String reting(){
        return this.reting;
    }
}
class gypermarket implements tovar {
    String nazvanie;
    String zena;
    String reting;
    gypermarket (String nazvan, String zena, String reting){
        this.nazvanie = nazvan;
        this.zena = zena;
        this.reting = reting;
    }
    @Override    public String nazvan() {
        return this.nazvanie;
    }
    @Override    public String zena(){
        return this.zena;
    }
    @Override    public String reting(){
        return this.reting;
    }
}
class combination implements user, tovar {

    String password;
    String login;
    String fio;
    String zena;
    String rating;
    String tovar;

    combination(String fio, String login, String zena, String rating, String tovar) {
        this.password = password;
        this.login = login;
        this.rating = rating;
        this.zena = zena;
        this.fio = fio;
        this.tovar = tovar;
    }

    @Override
    public String nazvan() {
        return tovar;
    }

    @Override
    public String zena() {
        return zena;
    }

    @Override
    public String reting() {
        return rating;
    }

    @Override
    public String login() {
        return login;
    }

    @Override
    public String password() {
        return password;
    }

    void wiwo() {
        System.out.println(fio + " купил товар " + tovar + " по цене " + zena);
    }
}
public class Main {

    public static void main(String[] args) {
        magazine a = new magazine("Морковь","30", "10");
        supermarket b = new supermarket("Сковородка", "600", "10");
        gypermarket c = new gypermarket("Телевизор", "25000","10");
        user1 d = new user1 ("yarek", "wasd1324","palip");
        user2 e = new user2 ("dmitri sherihalin", "yaishak","paris");
        user3 f = new user3 ("dmitri sherihalin", "yaishak","paris");
        combination r = new combination("yarek","poton","20000","10","welosiped");
        r.wiwo();
    }
}
