package BitMagic;

public class KthBitSet {
    
    static boolean isKthSet(int n, int k){
    return (n & (1 << (k - 1))) != 0;
}
    }
    public static void main(String[] args) {
       System.out.println(isKthSet(5, 3)); 
    }
}
