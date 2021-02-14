import java.util.Scanner;

public class codeUp_1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.nextLine().charAt(0);
        int y = (int)x + 1;
        sc.close();
        System.out.println((char) y);
    }
}
