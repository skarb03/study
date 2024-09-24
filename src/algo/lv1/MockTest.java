package algo.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 주석처리된 코드는 처음 작성한 코드 .
 * 루프를 한번돈다고 빠른게 아니였다.
 * 이중루프 이더라도 정해진 숫자가 있다면 빠르다.
 * if문이 많으면 오래걸린다.
 */
public class MockTest {
    public static void main(String[] args) {
//        int[] answers = {1, 3, 2, 4, 2};
        int[] answers = {1,2,3,4,5};

        MockTest mt = new MockTest();

        System.out.println(Arrays.toString(mt.solution(answers)));
    }

//    public int[] solution(int[] answers) {
//        int[] number1 = {1, 2, 3, 4, 5};
//        int[] number2 = {2, 1, 2, 3, 2, 4, 2, 5};
//        int[] number3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
//
//        int[] correct = new int[3];
//
//        for (int i = 0; i < answers.length; i++) {
//            if (number1[i % number1.length] == answers[i]) {
//                correct[0]++;
//            }
//            if (number2[i % number2.length] == answers[i]) {
//                correct[1]++;
//            }
//            if (number3[i % number3.length] == answers[i]) {
//                correct[2]++;
//            }
//        }
//        int max = Arrays.stream(correct).max().getAsInt();
//        List<Integer> answer = new ArrayList<>();
//        for (int i = 0; i < correct.length; i++) {
//            if(max == correct[i]){
//                answer.add(i+1);
//            }
//        }
//
//        return answer.stream().mapToInt(Integer::intValue).toArray();
//    }

    public int[] solution(int[] answers) {
        int[][] pattern= {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] correct = new int[3];

        for(int i=0;i < answers.length; i++){
            for (int j=0;j< pattern.length;j++){
                if( answers[i] == pattern[j][i%pattern[j].length]){
                    correct[j]++;
                }
            }
        }

        int max = Arrays.stream(correct).max().getAsInt();
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < correct.length; i++) {
            if(max == correct[i]){
                answer.add(i+1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }


}
