

public class SieveAlgo {
   static void sieve(int n){
        boolean[] Prime = new boolean[n + 1];

        for(int i = 0; i<= n; i++){
            Prime[i]=true;
        }

       for(int p = 2; p * p <=n; p++){
        if (Prime[p]==true) {
            
            for(int j = p*p; j<=n; j= j+p){
                Prime[j]=false;
            }
            
        }
       }
       for (int i = 2; i <= n; i++) {
			if (Prime[i] == true)
				System.out.print(i + " ");
		}
    }
    public static void main(String[] args) {
        sieve(20);
    }
}
