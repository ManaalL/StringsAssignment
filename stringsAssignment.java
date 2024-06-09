import java.util.Scanner;
/**
 * Strings Assignment 
 *
 * @Manaal Lakhani
 * @May 7, 2024
 */
public class stringsAssignment
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            // Create a Scanner object for user input
    }
    /**
     * Prompts the user to enter a name and then returns a greeting 
     */
    public static String greeting(){
        Scanner scan = new Scanner(System.in);
            // Create a Scanner object for user input
    
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        
        return("Hello " + name + "!");
    }
    /**
     * Takes a word from the user and repeats x amount of times the user says to
     */
    public static String repeatIt(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a word to repeat: ");
        String word = scan.nextLine();
        
        System.out.println("Enter the amount of times to repeat the word: ");
        int n = scan.nextInt();
        
        String repeated = word.repeat(n);
        
        return repeated;
    }
    /** 
     * Takes a word and a phrase from the user and checks how many time that word is repeated in the phrase
     */
    public static int repeats() {
        Scanner scan = new Scanner(System.in); 
            // Create a Scanner object for user input
        
        System.out.println("Enter a word: ");
        String word = scan.nextLine();  
            // Saves a word as a string 
        
        System.out.println("Enter a phrase: ");
        String phrase = scan.nextLine();
            // Saves a phrase as a string
    
        int count = 0;
        int index = 0;
            // Sets count and index to 0 
        while (index != -1) {
            index = phrase.indexOf(word, index);
            if (index != -1) {
                count++;
                index += word.length();
            }
        }
            // Calculates if index does not equal to -1, it adds to the count
        scan.close(); 
            // Close the scanner
        return count;
    }
    /**
     * Asks the user to enter a phrase and checks how many vowles there are 
     */
    public static int vowels() {
        Scanner scan = new Scanner(System.in); 
            // Creates a scanner
    
        System.out.println("Enter a phrase: ");
        String phrase = scan.nextLine();
            // Asks the user for a phrase and saves it as a string
    
        int count = 0;
            // Sets the count to 0
        for (char c : phrase.toLowerCase().toCharArray()) {
                // goes over each character in the phrase
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                // Checks if the character is a vowel
                count++;
                    // Adds 1 to the count if its true
            }
        }
        return count;
            // Returns the count 
    }
    /**
     * Returns the number of words in String phrase. A word is any
    number of joined characters separated by one or more spaces.
     */
    public static int words() {
        Scanner scan = new Scanner(System.in); 
            // Creates a Scanner
    
        System.out.println("Enter a phrase: ");
        String phrase = scan.nextLine();
             // Saves a phrase as a string
        
        String[] words = phrase.trim().split("\\s+");
            // Split the input phrase into words using whitespace as delimiter
        return words.length;
            // Returns the word length
    }
    /**
     * Switches the case of each letter in phrase and returns the
    result as a String. Assume phrase contains only letters.
     */
    public static String upperLower() {
        Scanner scan = new Scanner(System.in); 
            // Creates a string
    
        System.out.println("Enter a phrase: ");
        String phrase = scan.nextLine();
            // Asks user to enter a phrase and saves it as a string
            
        StringBuilder result = new StringBuilder();
            //// Creates a StringBuilder to store the result
        for (char c : phrase.toCharArray()) {
                // Goes over each character in the phrase
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
                    // Checks if the charecter is uppercase, if its true then changes it to lower case
            } 
            
            else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
                    // If charecter is lowercase, then it changes to uppercase
            } 
            
            else {
                result.append(c);
                    // If its neither, then it appends
            }
        }
        return result.toString();
            //// Return the result as a string
    }
    /**
     * Returns the number of words in phrase that are n letters long.
     */
    public static int nCount() {
        Scanner scan = new Scanner(System.in); 
            // Creates a scanner
    
        System.out.println("Enter a phrase: ");
        String phrase = scan.nextLine();
            // Asks the user for a phrase 
         
    
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
            // Asks the user for the number of how long the words are 
        
        int count = 0;
            // Sets the count to 0
        
        String[] words = phrase.trim().split("\\s+");
            //// Split the input phrase into words using whitespace as delimiter
        for (String word : words) {
            if (word.length() == n) {
                count++;
                    // If the word length equals to n, then the count increases
            }
        }
        return count;
            // Returns the count 
    }
}
