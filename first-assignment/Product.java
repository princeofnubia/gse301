// product of even number between 1 and 5000 is impossible since the long type 
// which hold 64 bit (highest bit memory) cannot save such multiplication
// the highest it can hold is product of even number between 1 and 60
public class Product {
    public static void main (String[] args){
        int number = 1;
        long product = 1;
        while (number <= 60) {
            if (number % 2 == 0){
                product = number * product;          
            }
            number++;
        }
        System.out.println("product: " + product);
    }
}