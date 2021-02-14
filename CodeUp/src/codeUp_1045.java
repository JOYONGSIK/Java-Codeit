import java.util.Scanner;

public class codeUp_1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println((int)x/(int)y);
        System.out.println(x%y);
        System.out.printf("%.2f", (float) x/(float) y);
    }
}
