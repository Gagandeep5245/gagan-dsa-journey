package BitMagic;

public class Powerset {
    static void powerSet(String s){
      int n = s.length();
      int p_size = 1<<n;
      
      for (int i = 0; i < p_size; i++) {
        for(int j =0; j<n; j++){
            if ((i & (1<<j)) !=0) {
                System.out.print(s.charAt(j)+ " ");
                
            }
           
        }
         System.out.println();
      }

    }
    public static void main(String[] args) {
        String s = "abc";
        powerSet(s);
    }
}
