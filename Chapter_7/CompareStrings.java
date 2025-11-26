import java.util.Scanner;

public class CompareStrings {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String correctName = "Carmen";
        
        
        System.out.print("Enter your name > ");
        String userInput = scanner.nextLine();
        
        

        if (correctName.equals(userInput)) {
            System.out.println(correctName + " equals " + userInput);
        } else {
            System.out.println(correctName + " does not equal " + userInput);
        }
        
        
        scanner.close();
    }
}
