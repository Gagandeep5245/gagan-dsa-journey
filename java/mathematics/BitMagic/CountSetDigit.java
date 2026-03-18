package BitMagic;

public class CountSetDigit {
    static int setDigits(int n){
        if(n==0){
            return 0;
        }
        int count =0;
        while (n>0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(setDigits(50));
    }
}
