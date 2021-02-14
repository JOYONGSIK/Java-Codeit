import java.util.Scanner;

public class codeUp_1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        sc.close();

        char[] arr = new char[word.length()];

        for (int i = 0 ; i < word.length(); i++) {
            arr[i] = word.charAt(i);
        }

        for (char c : arr) {
            System.out.println("'" + c +"'");
        }
    }
}
