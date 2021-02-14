import java.util.*;
import java.util.stream.Stream;
public class codeUp_1025{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        s.close();

        int[] al =
                Stream.of(String.valueOf(a).split("")).mapToInt(Integer::parseInt).toArray();

        System.out.println("["+al[0]*10000+"]");
        System.out.println("["+al[1]*1000+"]");
        System.out.println("["+al[2]*100+"]");
        System.out.println("["+al[3]*10+"]");
        System.out.println("["+al[4]*1+"]");

    }
}