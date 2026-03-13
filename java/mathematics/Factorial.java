package mathematics;

public class Factorial {
    static int factorial(int n){
        // int temp = n;
        // int result = 1;
        // if (n==0) {
        //     return 1;
        // }
        // while (temp != 1) {
        //     result = result * temp;
        //     temp = temp -1;
        // }
        // return result;

        if (n==0) {
           return 1; 
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int result = factorial(6);
        System.out.println(result);
    }
}
