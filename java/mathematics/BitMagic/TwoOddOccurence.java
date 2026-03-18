package BitMagic;

public class TwoOddOccurence {
    static int[] twoOddOccurence(int arr[]){
        
        int x = 0;

        // Step 1: XOR of all elements
        for(int i = 0; i < arr.length; i++){
            x = x ^ arr[i];
        }

        // Step 2: Find rightmost set bit
        int k = x & (~(x - 1));

        int res1 = 0, res2 = 0;

        // Step 3: Divide into 2 groups
        for(int i = 0; i < arr.length; i++){
            if ((arr[i] & k) != 0){
                res1 = res1 ^ arr[i];
            } else {
                res2 = res2 ^ arr[i];
            }
        }

        return new int[]{res1, res2};
    }

    public static void main(String[] args) {
        int[] num = {2,2,2,3,3,4,4,5,5,3,6,6};

        int[] result = twoOddOccurence(num);
        System.out.println(result[0] + " " + result[1]);
    }
}