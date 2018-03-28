public class Prime {
    boolean isPrime(int i){
        for(int x = 2; x < i; x++){
            if (i % x == 0){
                return false;
            }
        }
        return true;
    }
}