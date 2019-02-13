//TextToMorseCode.java
// Application that outputs the Morse code for a normal text.
import java.util.StringTokenizer;

public class TextToMorseCode
{
    //Morse code numbers and letters
    static String[] letters = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    
    //normal english characters
    static String[] numbers = {"-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};
    
    //translate normal text to morse code
    public static String getMorseCode(String phrase)
    {
        String morseCode = "";
        
        //convert each character
        for (int i = 0; i <phrase.length(); i++)
        {
            char alpha = phrase.charAt(i);
            
            //if the character is a number, access the number array
            if (Character.isDigit(alpha))
            {
                morseCode += numbers[alpha - '0'] + " ";
            }
            
            // if the characters is a letter, access the letter array
            if (Character.isLetter(alpha))
            {
                morseCode += letters[Character.toUpperCase(alpha) - 'A'] + " ";
            }
            
            //if the character is a space, output two extra spaces
            if (alpha == ' ')
            {
                morseCode += "   ";
            }
        }
        
        return morseCode;
    }
}