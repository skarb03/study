package algo.lv2;

public class SW2Backup {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        String dirs = "ULURRDLLU";
        System.out.println(solution.solution(dirs));

    }
}

class Solution2 {
    int passLocation[][] = new int[10][10];
    int xLocation = 5;
    int yLocation = 5;
    public int solution(String dirs) {

        int answer = 0;
        passLocation[xLocation][yLocation] = 1;

        char []dirArray = dirs.toCharArray();

        for(char dir : dirArray){
            calcLocation(dir);
        }
        answer = checkCount();
        return answer;
    }

    private void calcLocation(char letter){
        switch (letter){
            case 'L' :
                if(xLocation!=0) {
                    xLocation--;
                    passLocation[xLocation][yLocation]=1;
                } break;
            case 'R':
                if(xLocation!=10) {
                    xLocation++;
                    passLocation[xLocation][yLocation]=1;
                } break;
            case 'U':
                if(yLocation!=10) {
                    yLocation++;
                    passLocation[xLocation][yLocation]=1;
                } break;
            case 'D':
                if(yLocation!=0) {
                    yLocation--;
                    passLocation[xLocation][yLocation]=1;
                } break;
        }
    }

    private int checkCount(){
        int count=0;

        for(int i = 0; i< passLocation.length; i ++){
            for(int j = 0; j<passLocation[i].length; j ++){
                if(passLocation[i][j]==1)
                    count++;
            }
        }

        return count;
    }
}