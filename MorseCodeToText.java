//MorseCodeToText.java
// Application that outputs the normal text for a Morse code.
import java.util.StringTokenizer;

public class MorseCodeToText
{
    //Morse code numbers and letters
    static String[] morseCharacters = {"-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    
    //normal english characters
    static String[] normalCharacters = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    
    //translate morse code phrase to normal text
    public static String getText(String morseCode)
    {
        String result = "";
        int start = 0, length = 0;
        int threeSpaces = morseCode.indexOf("   ");
        String word;
        
        //while we have not reached the end of Morse code
        while (length <morseCode.length())
        {
            if (threeSpaces != -1)
            {
                word = morseCode.substring(start, threeSpaces);
                length = threeSpaces;
            }
            else
            {
                word = morseCode.substring(start, morseCode.length());
                length = morseCode.length();
            }
            
            StringTokenizer letters = new StringTokenizer(word);
            
            // decode letter
            while (letters.hasMoreTokens())
            {
                result += decode(letters.nextToken());
            }
            
            result += " ";
            start = threeSpaces + 3;
            threeSpaces = morseCode.indexOf("   ", start);
        }
        
        return result;
    }
    
    //decode morse code letter
    private static String decode(String morseCode)
    {
        for(int i = 0; i <morseCharacters.length; i++)
        {
            if (morseCode.equals(morseCharacters[i]))
            {
                return normalCharacters[i];
            }
        }
        
        return "";
    }
}