import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr;
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("nhap chieu dai mang");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("mang qua dai");
            }
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        for (; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        for (int j = 0; j < arr.length/2; j++) {
            int temp = arr[j];
            arr[j]= arr[size-1-j];
            arr[size-1-j]= temp;

        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
