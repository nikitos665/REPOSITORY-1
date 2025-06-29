interface User {
    String logini();
    String passwordi();
}
abstract class People implements User {
    String fio;
    String age;
    String post;
}
class teacher extends People {
    private String password;
    private String login;
    teacher (String fio,String age, String post,String password,String login){
        this.age = age;
        this.fio = fio;
        this.post = post;
        this.password = password;
        this.login = login;
    }
    @Override
    public String logini() {
        return this.login+" (Метод)";
    }

    @Override
    public String passwordi() {
        return this.password;
    }
}
class student extends People {
    private String password;
    private String login;
    student (String fio,String age, String post,String password,String login){
        this.age = age;
        this.fio = fio;
        this.post = post;
        this.password = password;
        this.login = login;
    }
    @Override
    public String logini() {
        return this.login+" (Метод)";
    }

    @Override
    public String passwordi() {
        return this.password;
    }
}
public class Main {
    public static void main(String[] args) {
        teacher a = new teacher("Ярослав","25","учитель","wandu","yaro");
        teacher b = new teacher("Николай","32","учитель","trapo","nikola");
        student c = new student("Пётр","18","студент","wasd1`324567","pilik");
        student d = new student("Иван","17","студент","lamo567","ivanovik");
        System.out.println(a.logini());
        System.out.println(a.passwordi());
        System.out.println(b.logini());
        System.out.println(b.passwordi());
        System.out.println(c.logini());
        System.out.println(c.passwordi());
        System.out.println(d.logini());
        System.out.println(d.passwordi());



    }
}
//TIP Лабораторная работа № 12
//Создать интерфейс "Пользователь"с методами, работающие с логином
// и паролем. Создать абстрактный класс People, применяющий этот
// интерфейс, с полями "ФИО", "возраст", "должность". Создать два
// класса-наследника - "Преподаватель" и "Студент". Создать по два
// объекта данных классов.