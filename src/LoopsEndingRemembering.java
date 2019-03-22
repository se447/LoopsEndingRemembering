import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        /*
        Create a program that asks the user to input numbers (integers). 
        The program prints "Type numbers” until the user types the number -1. 
        When the user types the number -1, the program prints "Thank you and see you later!" and ends.
        
        Develop your number reading program by adding the following feature: 
        the program should print the sum of the numbers entered by the user (without the number -1).
        
        The program should print how many numbers the user typed (without the number -1).
        
        The program should print the average of the numbers the user typed (without the number -1).


        */
        System.out.println("Type numbers: ");
        int number = Integer.parseInt(reader.nextLine());
        
        
        int sum = 0;
        int count = 0;
        double average = 0;
        int even = 0;
        int odd = 0;
        
        while (number != -1) {
            System.out.println(number);
            
            sum += number;
            count += 1; //counts numbers read into program
            average = (double)sum / count;
            if (number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
            
            number = Integer.parseInt(reader.nextLine()); //read next number   
        }
        
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
