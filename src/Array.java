public class Array {
    public static void main(String[] args){
        int[] intArray = new int[5];
        // 다섯개의 요소를 넣어줄 수 있다. 크기가 5인 빈 배열

        // int[] intArray = {1, 2, 3, 4, 5}; 이렇게 리터럴로 생성을 할 수도있다.
        // 그러나 두 줄로 나눠서 정의를 하게 될 경우 오류가 나온다.
        // int[] intArray;
        // intArray = {1, 2, 3, 4, 5} ; <- 오류이다.


        intArray[0] = 2;
        intArray[1] = 3;
        intArray[2] = 5;
        intArray[3] = 7;
        intArray[4] = 11;

//        System.out.println(intArray[2] + intArray[4]);

        for (int i = 0; i < intArray.length ; i++){
            System.out.println(intArray[i]);
        }
        // 자바에는 for-each 문법이 있어서 for-each를 쓰는 방법이다.
        for (int i : intArray) {
            System.out.println(i);
        }
    }
}
// 배열은 for문으로 많이 쓰인다.
