//public class For {
//    public static void main(String[] args){
//        int sum = 0;
//        for (int i = 1; i<=5; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//    }
//}

// 실습과제, for문으로 구구단을 출력해보세요.

public class For {
    public static void main(String[] args){
        for (int i = 1; i<=9; i++) {
            for (int j = 1; j<=9; j++){
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
    }
}