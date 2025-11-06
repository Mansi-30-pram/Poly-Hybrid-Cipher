 import java.util.*;
 public class HybridCipher {
    // Example substitution map (A→Q, B→W, C→E, etc.)
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String SUBSTITUTION = "QWERTYUIOPASDFGHJKLZXCVBNM"; // permutation
    // Encryption with hybrid rotation + substitution
    public static String encrypt(String text, int shift) {
        text = text.toUpperCase();
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                // Step 1: Caesar rotation
                int rotatedIndex = (ALPHABET.indexOf(c) + shift) % 26;
                char rotatedChar = ALPHABET.charAt(rotatedIndex);
                // Step 2: Substitution
                int subIndex = ALPHABET.indexOf(rotatedChar);
                char substitutedChar = SUBSTITUTION.charAt(subIndex);
                result.append(substitutedChar);
            } else {
                result.append(c); // leave spaces/punctuation unchanged
            }
        }
        return result.toString();
    }
    // Decryption (reverse substitution + reverse rotation)
    public static String decrypt(String text, int shift) {
        text = text.toUpperCase();
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                // Step 1: Reverse substitution
                int subIndex = SUBSTITUTION.indexOf(c);
                char rotatedChar = ALPHABET.charAt(subIndex);
                // Step 2: Reverse Caesar rotation
                int originalIndex = (ALPHABET.indexOf(rotatedChar) - shift + 26) % 26;
                char originalChar = ALPHABET.charAt(originalIndex);
                result.append(originalChar);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String message = "HELLO WORLD";
        int shift = 3;
        String encrypted = encrypt(message, shift);
        String decrypted = decrypt(encrypted, shift);
        System.out.println("Original : " + message);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}