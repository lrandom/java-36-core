public class Main5 {
    public static void main(String[] args) {
        int[] numbers = new int[10];//độ dài mảng (10 phần tử) không thể thay đổi
        numbers[0] = 1;
        numbers[1] = 2;

        int[] numbers2 = new int[]{
                1, 2, 3, 4, 5
        };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int num :numbers
             ) {
            System.out.println(num);
        }
    }
}
