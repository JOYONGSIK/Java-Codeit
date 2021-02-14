import java.util.Scanner;

public class codeUp_1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();
        System.out.println(x+y+z);
        System.out.printf("%.1f", (float) (x+y+z) / 3);
    }
}
