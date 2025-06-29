import java.util.regex.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("regex.txt"))){
            String text = rexs();
            if(!(text.isEmpty())){
                bw.write(text);
                bw.flush();
            }
            else {
                bw.write("Ничего не найдено");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static String rexs() {
        System.out.println("Введите строку: ");
        java.util.Scanner in = new java.util.Scanner(System.in);
        String text = in.nextLine();
        String regex = "\\b(1?\\d?\\d|2[0-4]\\d|25[0-5])(\\.(1?\\d?\\d|2[0-4]\\d|25[0-5])){3}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.group();
        }
        return "Плохкая строчка была:( плаке плаке";
    }
}