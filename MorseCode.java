//MorseCode.java
//application that outputs the Morse code for a string
import java.util.Scanner;

public class MorseCode
{
    public static void main(String args[])
    {
        //get input phrase
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a phrase:");
        String phrase = scanner.nextLine();
        
        //display result
        System.out.println("\nMorseCode:");
        String morseCode = TextToMorseCode.getMorseCode(phrase);
        System.out.println(morseCode);
    }
}