package study.recursive;

public class recursive {
    public static void main(String[] args) {

//        recursive recursive = new recursive();
//        recursive.recursiveCount(3);

        System.out.println(power(2,3));
    }

    void recursiveCount(int n){
        if (n==0) {
            return;
        }

        recursiveCount(n-1);
        System.out.println(n);
    }

    public static double power(int x, int y){
        if(y==0){
            return 1;
        }

        return x*power(x,y-1);
    }
}
