import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeTranslator {

    private static final Map<String, String> MORSE_TO_ENGLISH = new HashMap<>();

    static {
        // Populate the map with Morse code to English mappings
        MORSE_TO_ENGLISH.put(".-", "A");
        MORSE_TO_ENGLISH.put("-...", "B");
        MORSE_TO_ENGLISH.put("-.-.", "C");
        MORSE_TO_ENGLISH.put("-..", "D");
        MORSE_TO_ENGLISH.put(".", "E");
        MORSE_TO_ENGLISH.put("..-.", "F");
        MORSE_TO_ENGLISH.put("--.", "G");
        MORSE_TO_ENGLISH.put("....", "H");
        MORSE_TO_ENGLISH.put("..", "I");
        MORSE_TO_ENGLISH.put(".---", "J");
        MORSE_TO_ENGLISH.put("-.-", "K");
        MORSE_TO_ENGLISH.put(".-..", "L");
        MORSE_TO_ENGLISH.put("--", "M");
        MORSE_TO_ENGLISH.put("-.", "N");
        MORSE_TO_ENGLISH.put("---", "O");
        MORSE_TO_ENGLISH.put(".--.", "P");
        MORSE_TO_ENGLISH.put("--.-", "Q");
        MORSE_TO_ENGLISH.put(".-.", "R");
        MORSE_TO_ENGLISH.put("...", "S");
        MORSE_TO_ENGLISH.put("-", "T");
        MORSE_TO_ENGLISH.put("..-", "U");
        MORSE_TO_ENGLISH.put("...-", "V");
        MORSE_TO_ENGLISH.put(".--", "W");
        MORSE_TO_ENGLISH.put("-..-", "X");
        MORSE_TO_ENGLISH.put("-.--", "Y");
        MORSE_TO_ENGLISH.put("--..", "Z");
        MORSE_TO_ENGLISH.put(".----", "1");
        MORSE_TO_ENGLISH.put("..---", "2");
        MORSE_TO_ENGLISH.put("...--", "3");
        MORSE_TO_ENGLISH.put("....-", "4");
        MORSE_TO_ENGLISH.put(".....", "5");
        MORSE_TO_ENGLISH.put("-....", "6");
        MORSE_TO_ENGLISH.put("--...", "7");
        MORSE_TO_ENGLISH.put("---..", "8");
        MORSE_TO_ENGLISH.put("----.", "9");
        MORSE_TO_ENGLISH.put("-----", "0");
        MORSE_TO_ENGLISH.put("--..--", ",");
        MORSE_TO_ENGLISH.put(".-.-.-", ".");
        MORSE_TO_ENGLISH.put("..--..", "?");
        MORSE_TO_ENGLISH.put("-.-.--", "!");
        MORSE_TO_ENGLISH.put("-.--.", "(");
        MORSE_TO_ENGLISH.put("-.--.-", ")");
        MORSE_TO_ENGLISH.put(".-...", "&");
        MORSE_TO_ENGLISH.put("---...", ":");
        MORSE_TO_ENGLISH.put("-.-.-.", ";");
        MORSE_TO_ENGLISH.put("-...-", "=");
        MORSE_TO_ENGLISH.put(".-.-.", "+");
        MORSE_TO_ENGLISH.put("-....-", "-");
        MORSE_TO_ENGLISH.put("..--.-", "_");
        MORSE_TO_ENGLISH.put(".-..-.", "\"");
        MORSE_TO_ENGLISH.put("...-..-", "$");
        MORSE_TO_ENGLISH.put(".--.-.", "@");
        MORSE_TO_ENGLISH.put(".-.-..", "Ä"); // Example for extended characters
        MORSE_TO_ENGLISH.put("---.", "Ö");
    }

    public static String translateMorseToEnglish(String morseCode) {
        StringBuilder englishText = new StringBuilder();
        String[] words = morseCode.trim().split("   "); // Split by three spaces for words

        for (String word : words) {
            String[] letters = word.split(" "); // Split by single space for letters
            for (String letterMorse : letters) {
                String englishLetter = MORSE_TO_ENGLISH.get(letterMorse);
                if (englishLetter != null) {
                    englishText.append(englishLetter);
                } else {
                    englishText.append("[UNKNOWN]"); // Handle unknown Morse sequences
                }
            }
            englishText.append(" "); // Add space between words
        }
        return englishText.toString().trim(); // Trim any trailing space
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Morse code (use single space for letter separation, three spaces for word separation):");
        String inputMorse = scanner.nextLine();

        String translatedText = translateMorseToEnglish(inputMorse);
        System.out.println("Translated English: " + translatedText);

        scanner.close();
    }
}