import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scanner.nextInt();
        boolean div3 = num%3 == 0;
        boolean div5 = num%5 == 0;
        if (div3 && div5){
            System.out.println("FizzBuzz");
        } else if (div5) {
            System.out.println("Fizz");
        } else if (div3) {
            System.out.println("Buzz");
        }else {
            System.out.println(num);
        }
    }
}
