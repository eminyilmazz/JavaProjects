package Crypto;// Muhammed Emin Yılmaz 090150303
import java.util.Scanner;
public class Decryption {
    private static Scanner input = new Scanner(System.in);
    public static int sumDigits (long num) {
        int sum = 0;
        while (num > 0) {
            sum = (int) (sum + (num % 10));
            num = num / 10;
        } return sum; }
    public static boolean checkValidity(String encryptedMessage, long decryptionKey) {
        if (sumDigits(decryptionKey) != encryptedMessage.length()) {
            System.out.println("The key and encrypted text are not compatible and cannot be resolved.");
            return false; }
        int i = 0;
        while (i < Long.toString(decryptionKey).length()) {
            if (Long.toString(decryptionKey).charAt(i) != '2' && Long.toString(decryptionKey).charAt(i) != '3') {
                System.out.println("Key is not proper.");
                return false; }
            i++; }
        return true; }
    public static void decrypt(String encryptedMessage, long decryptionKey) {
        int beginIndex = 0, numberIndex = 0, i = 0;
        while (i < Long.toString(decryptionKey).length()) {
            numberIndex = Character.getNumericValue(Long.toString(decryptionKey).charAt(i++));
            System.out.print((char) Integer.parseInt(encryptedMessage.substring(beginIndex, beginIndex + numberIndex)));
            beginIndex += numberIndex; }
    }
    public static void main(String[] args) {
        System.out.print("Enter the encrypted message: ");
        String encryptedMessage = input.nextLine();
        System.out.print("Enter the decryption key: ");
        long decryptionKey = input.nextLong();
        if(checkValidity(encryptedMessage, decryptionKey)) { decrypt(encryptedMessage, decryptionKey); }
    }
}