public class Array_Q1 {
    public static void main(String[] args) {
        int[] intArray = new int[30]; // 빈 리스트를 30개 만들어준다.
        for (int i = 0; i < intArray.length; i++ ){
            intArray[i] = 1001 + i;
        } // 문제의 조건과 맞게 1001~1030까지 만들어준다.

        String[] remainders = new String[4]; // 문자열 배열을 만들어준다.
        remainders[0] = "Zero";
        remainders[1] = "One";
        remainders[2] = "Two";
        remainders[3] = "Three";

        for (int x : intArray) {
            System.out.println(remainders[x % 4]);
            // 4로 나눈 나머지로 인덱스를 찾는다.
        }
    }
}
