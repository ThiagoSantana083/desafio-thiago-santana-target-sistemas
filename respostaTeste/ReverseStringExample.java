package respostaTeste;

public class ReverseStringExample {
    public String reverseString(String str) {
        int length = str.length();
        char[] reversedChars = new char[length];

        // Iterando sobre a string da última posição até a primeira posição
        for (int i = 0; i < length; i++) {
            reversedChars[i] = str.charAt(length - 1 - i);
        }

        // Construindo a string invertida a partir do array de caracteres
        String reversedString = new String(reversedChars);
        return reversedString;
    }
}

