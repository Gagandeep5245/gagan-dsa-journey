package mathematics;

public class Gcd {

    static int gcdOfNumbers(int a, int b){
        
        // if (a==0) {
        //     return b;
        // }
        // if (b==0) {
        //     return a;
        // }
        // //base case 
        // if(a==b){
        //     return a;
        // }
        // if(a>b) {
        //     return gcdOfNumbers(a-b, b);
        // }
        // else{
        //     return gcdOfNumbers(b-a, a);
        // }
        
        //short method for this 

        if (b==0) {
            return a;
        }
        return gcdOfNumbers(b, a % b);
    }
    public static void main(String[] args) {
       int result =  gcdOfNumbers(20, 15);
       System.out.println(result);
    }
}
