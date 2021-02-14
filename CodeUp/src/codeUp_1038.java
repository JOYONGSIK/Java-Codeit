import java.util.Scanner;

public class codeUp_1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");

        long[] arr1 = new long[arr.length];

        for (int i=0; i < arr.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }
        System.out.println(arr1[0] + arr1[1]);
    }
}
