import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int in;
        double C;
        double F;
        do {
            System.out.println("nhap 1 de chuyen tu do C => do F");
            System.out.println("nhap 2 de chuyen tu do F => do C");
            in = input.nextInt();
            switch (in){

                case 1:
                    System.out.println("nhap do C");
                     C = input.nextDouble();
                     F = 1.8*C+32;
                    System.out.println(C+" độ c bằng "+ F+" độ f");

                case 2:
                    System.out.println("nhập độ F");
                    F = input.nextDouble();
                    C = (F-32)*5/9;
                    System.out.println(F+" độ F bằng "+ C+ " độ c");
                default:
                    break;
            }
        }while (in!=1&&in!=2);
    }
}
