import java.util.Scanner;

public class codeUp_1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[] time_list = time.split(":");
        sc.close();

        int x = Integer.parseInt(time_list[1]);
        System.out.println(x);
    }
}
