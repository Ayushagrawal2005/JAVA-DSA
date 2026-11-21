public class Func{
    public static void printHelloWorld(){
        System.out.println("Hello World");
    }
    public static void sum(int a, int b){
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
    public static void multiply(int a, int b){
        int product = a * b;
        System.out.println("The product is: " + product);
    }
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    public static int binomialCoefficient(int n , int r){
        int res = 1;
        res = factorial(n) / (factorial(r) * factorial(n - r));
        return res;
    }
    public static void decimalconversion(int dec){
        int pow = 0;
        int bin = 0;
        while(dec > 0){
            int rem = dec % 2;
            bin += rem * Math.pow(10, pow);
            dec /=2;
            pow++;
        }
        System.out.println("The binary equivalent is: " + bin);
    }
    public static void main(String[] args) {
        printHelloWorld();
        sum(3879,3999);
        multiply(3879,3999);
        System.out.println("The binomial coefficient of C(5,2) is: " + binomialCoefficient(5, 2));
        System.out.println("The factorial of 5 is: " + factorial(5));
        decimalconversion(10);
      }
}