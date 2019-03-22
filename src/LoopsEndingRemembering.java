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
        */
        System.out.println("Type numbers: ");
        int number = Integer.parseInt(reader.nextLine());
        
        while (number != -1) {
            System.out.println(number);
            
            number = Integer.parseInt(reader.nextLine());        
        }
        
        System.out.println("Thank you and see you later!");
    }
}
