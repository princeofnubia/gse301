// main class is using prime class to check prime
public class MyPrime {
    public static void main(String[] args){
        int number = 5000;
        String list = "{";
        Prime prime = new Prime();
        for(int i = 1; i <= number; i++){
          if (prime.isPrime(i)){
             list =list + (String) (i + ",");
          }
        }
        System.out.println(list + "}"); 
    }
}