package BitMagic;

public class PowerOfTwo {
    static Boolean powerOfTwo(int n){
        
       return (n > 0) && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        System.out.println(powerOfTwo(8));
    }
}
