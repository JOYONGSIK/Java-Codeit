import java.util.Scanner;

public class codeUp_1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[] time_list = time.split("\\.");

        int[] arr = new int[time_list.length];

        for (int i = 0; i < time_list.length; i++) {
            arr[i] = Integer.parseInt(time_list[i]);
        }

        System.out.printf("%04d.%02d.%02d", arr[0], arr[1], arr[2]);
        sc.close();
    }
}
