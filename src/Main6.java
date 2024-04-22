public class Main6 {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];//mảng 2 chiều : 2 dòng 3 cột
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[1][0] = 4;
        numbers[1][1] = 5;
        numbers[1][2] = 6;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.printf("\n");
        }

        for (int[] row : numbers) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.printf("\n");
        }

        //literal array
        int[][] numbers2 = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };
    }
}

