package algo.lv2;

public class SummerWinter {

    int xLocation = 0;
    int yLocation = 0;
   public static void main(String[] args) {
        SummerWinter summerWinter = new SummerWinter();

        String dirs = "ULURRDLLU";
       System.out.println(summerWinter.solution(dirs));

    }

    public int solution(String dirs) {

        int answer = 0;

        return answer;
    }

    private void calcLocation(char letter){
        switch (letter){
            case 'L' :
                if(xLocation>=-5) {
                    xLocation--;
                } break;
            case 'R':
                if(xLocation!=10) {
                    xLocation++;
                } break;
            case 'U':
                if(yLocation!=10) {
                    yLocation++;
                } break;
            case 'D':
                if(yLocation!=0) {
                    yLocation--;
                } break;
        }
    }
}
