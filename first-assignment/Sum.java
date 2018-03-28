public class Sum {
    public static void main (String[] args){
        int number = 0;
        int sum = 0;
        while (number <= 5000) {
            if (number % 2 == 0){
                sum += number;          
            }
            number++;
        }
        System.out.println("sum: " + sum);
    }
}