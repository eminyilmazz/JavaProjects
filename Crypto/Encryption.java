package Crypto;

import java.util.Scanner;
public class Encryption {
    public static Scanner input = new Scanner(System.in);
    public static void encrypt(String text) {
        String encryptedText = "";
        Long encryptionKey = Long.valueOf(0);
        int i = 0, ascii = 0;
        while (i < text.length()) {
            ascii =  text.charAt(i++);
            encryptedText = encryptedText + ascii;
            encryptionKey = Long.parseLong(encryptionKey + String.valueOf((long)String.valueOf(ascii).length())); }
        System.out.println("encryptedText: " + encryptedText +
                           "\nencryptionKey: " + encryptionKey); }
    public static void main(String[] args) {
        System.out.print("Enter the string you want to encrypt: ");
        String text = input.nextLine();
        encrypt(text); }
} // 105108107101109326051 33333222