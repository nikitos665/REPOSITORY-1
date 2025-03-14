import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Scanner you = new Scanner(System.in);
        System.out.println("Введите N - Размерность массива");         int n = you.nextInt();
        int [] mass = new int[n];
        for (int i =0; i<n; i++){
            mass[i] = (int)(Math.random()*100);
        }
        System.out.print(Arrays.toString(mass));
        sort (mass);
        System.out.print(Arrays.toString(mass));
    }
    public static int pop(int [] mass, int size){
        if (size<=0){
            return -1;
        }
        int top = mass[0];
        mass[0] = mass[size-1];
        heapify(mass,0,size-1);
        return top;
    }
    static void sort (int mass[]){
        int k = mass.length;
        int u = (k/2)-1;
        while(u>=0){
            heapify(mass,u,k);
            u--;
        }
        System.out.print(Arrays.toString(mass));
        while (k>0){
            mass[k-1]=pop(mass,k);
            k--;
        }
    }
    static void heapify(int mass[], int u, int k){
        int left = LEFT(u);
        int right = RIGHT(u);
        int largest = u;
        if((left<k) && (mass[left]>mass[largest])){
            largest = left;

        }
        if((right<k)&&(mass[right]>mass[largest])){
            largest = right;
        }
        if(largest != u){
            swap(mass,u,largest);
            heapify(mass,largest,k);
        }
    }
    static int RIGHT (int u){
        return 2*u+2;
    }
    static int LEFT (int u){
        return 2*u+1;
    }
    static void swap (int mass[],int u, int largest){
        int tau = mass[u];
        mass[u] = mass[largest];
        mass[largest] = tau;
    }
}
