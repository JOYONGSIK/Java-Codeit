import java.util.Scanner;

public class codeUp_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clock = sc.nextLine();
        String[] arr = clock.split(":");

        System.out.printf("%s:%s", arr[0], arr[1]);
        sc.close();
    }
}
