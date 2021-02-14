import java.util.Scanner;

public class codeUp_1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.nextLine();
        String[] arr1 = arr.split("\\.");
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        sc.close();
    }
}
