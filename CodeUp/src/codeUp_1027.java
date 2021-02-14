import java.util.Scanner;

public class codeUp_1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("\\.");
        sc.close();

        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            arr1[i] = Integer.parseInt(arr[i]);
        }
        System.out.printf("%02d-%02d-%04d", arr1[2], arr1[1], arr1[0]);
    }
}
