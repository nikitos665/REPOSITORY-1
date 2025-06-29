import java.util.Arrays;
import java.util.Scanner;
interface Sorting{
    boolean swap(int temp,int x);
}
public class Main {
    public static void Sort(int[] A, Sorting func){
        int j;
        for(int i = 1; i<A.length; i++){
            int temp = A[i];
            for(j = i; j > 0 && func.swap(temp,A[j-1]); j--){//место, где лямбды меняют работу метода
                A[j] = A[j - 1];
            }
            A[j] = temp;
        }
        System.out.println("Конечный массив:\n" + Arrays.toString(A));
    }
    public static void main(String[] args){
        Sorting upward = (temp, x) -> temp < x;
        Sorting downward = (temp, x) -> temp > x;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int[] A = new int[in.nextInt()];
        for(int i = 0;i < A.length;i++){
            A[i] = (int)(Math.random() * 101);
        }
        System.out.println(Arrays.toString(A));
        System.out.println("Выберите как отсортировать:\n1 - по возрастанию\n2 - по убыванию");
        switch (in.nextInt()){
            case 1:{Sort(A, upward);break;}
            case 2:{Sort(A,downward);break;}
        }

    }
}