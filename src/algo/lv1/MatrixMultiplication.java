package algo.lv1;

/**
 * arr2 두번째 루프설정을 이해하지 못했다.
 * 2,3번째 루프 순서를 바꿨어야 했다.
 */

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        MatrixMultiplication mm = new MatrixMultiplication();

        mm.solution(arr1, arr2);
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }
}
