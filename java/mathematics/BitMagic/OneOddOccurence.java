package BitMagic;

public class OneOddOccurence {
    static int oneOddOccurence(int arr[]){
       int res = 0;
        for(int i=0; i< arr.length; i++){
            
            res = res ^ arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] num = {2,2,2,3,3,4,4,5,5};
        System.out.println(oneOddOccurence(num));
    }
}
