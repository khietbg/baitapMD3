import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        String[] student = {"hieu", "nam", "khiet", "tuan"};
        Scanner name = new Scanner(System.in);
        System.out.println("nhap ten hoc sinh");
        String std = name.nextLine();
        boolean check = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(std)) {
                System.out.println("vi tri cua hoc sinh " + std + " o vi tri thu " + i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("k co hoc sinh trong danh sach");
        }
    }

}
