import java.text.NumberFormat;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        int var1 = Math.round(1.5F); // Not same as (int)1.5F
        System.out.println(var1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(1234));

        int temp = 32;
        if (temp>30){
            System.out.println("It's Hot today");
        } else if (temp>20) {
            System.out.println("Its Nice Weather");
        } else
            System.out.println("Its cold");

        int income = 120_000 ;
        boolean hasHighIncome = false; // if not declared outside it won't be usable outside that code block
        if ( income > 100_000 )
            hasHighIncome = true ;
        // OR
        String highLow = income > 100_000 ? "High" : "low";

        //Switch Statement
        String role = "admin";
        switch (role){
            case "admin":
                System.out.println("You're an Admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
                // No break statement needed
        }

        // Loops
        // For Loops
        for (int i =0;i<5;i++){
            System.out.println("Hello World " + i);
        }
        // While Loops
        int i = 5;
        while (i > 0){
            System.out.println("Hello World " + i);
            i--;
        }
        // For each Loop
        String[] fruits={"apple","orange","mangoes"};
        for (String fruit : fruits)
            System.out.println(fruit);

        // Conditional Loops Strings
        Scanner scanner = new Scanner(System.in);
        String input="";
        while (!input.equals("quit")){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }while (input.equals("quit"));



        System.out.print("Name: ");
        String name  = scanner.next().trim();
        System.out.println("You are " + name);


    }
}
