//MorseToNormalText.java
//application that outputs the normal text for a Morse code.
import java.util.Scanner;

public class MorseToNormalText
{
    public static void main(String[] args)
    {
        //get Morse code
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Morse code:");
        String morseCode = scanner.nextLine();
        
        //display result
        System.out.println("\nNormal Text:");
        String text = MorseCodeToText.getText(morseCode);
        System.out.println(text);
    }
}