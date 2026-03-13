import java.util.ArrayList;

public class AllDivisors {

    static void printDivisors(int n){
       ArrayList<Integer> list = new ArrayList<>();

       for (int i = 1; i <= Math.sqrt(n); i++) {
          if (n%i==0) {
            
            // check if divisors are equal
            if (n/i == i) {
                 System.out.printf("%d ", i);
            }
            else {
                    System.out.printf("%d ", i);
                    // push the second divisor in the vector
                    list.add(n / i);
                }
          }
       }
       for(int i = list.size()-1; i>=0;i--){
            System.out.printf("%d ", list.get(i));
       }
    }
    public static void main(String[] args) {
        System.out.println("The divisors of 100 are: ");
        printDivisors(100);
    }
}
