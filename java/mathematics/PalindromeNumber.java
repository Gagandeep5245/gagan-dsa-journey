package mathematics;

class PalindromeNumber {

    static boolean isPal(int n){
        int temp = n;
        int rev = 0;

        while(temp != 0){
            int digit = temp % 10;
            temp = temp / 10;
            rev = rev * 10 + digit;
        }

        return (rev == n);
    }

    public static void main(String[] args){
        boolean result = isPal(123321);
        System.out.println(result);
    }
}
