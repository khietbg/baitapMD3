import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;


        do {
            System.out.println("nhap size");

            size = input.nextInt();
            int [] students = new  int [size];

            if (size<30){
                System.out.println("nhap so diem cua sinh vien");
                for ( int i = 0; i < students.length; i++) {
                    students[i]= input.nextInt();
                }
                for (int i = 0; i < students.length; i++) {
                    if (students[i] >= 5){
                        System.out.println("sinh vien thu "+ i+" vuot qua ky thi");
                    }
                    else {
                        System.out.println("sinh vien thu "+ i+" khong vuot qua");
                    }
                }
            }


        }while (size>30);
    }
}
