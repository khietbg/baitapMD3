import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int[] arr;
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap size");
        size = input.nextInt();
        System.out.println("nhap so vao mang");


        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                arr[i] = min;
            }
        }
        System.out.println("min la: "+min);
    }
}
