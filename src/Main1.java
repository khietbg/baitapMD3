import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int [] num;
        int size;
        Scanner input= new Scanner(System.in);
        do {
            System.out.println("nhap size vao day");
            size = input.nextInt();
            if (size>5) {
                System.out.println("mang qua dai");

            }
        }while (size>5);
        num = new int[size];
        for (int i = 0; i < num.length; i++) {
           int in = input.nextInt();
           num[i]=in;
        }
        int max = 0;
        for (int j = 0; j < num.length; j++) {
            if (max<num[j]){
                max = num[j];
            }

        }
        System.out.println("max la: " + max);
    }
}
