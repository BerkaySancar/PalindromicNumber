import java.util.Scanner;

public class PalindromicNumber {
    /*

    A palindromic number (also known as a numeral palindrome or a numeric palindrome) is a number
    (such as 1991) that remains the same when its digits are reversed. In other words, it has reflectional
    symmetry across a vertical axis.

     */
    static boolean isPalindromic(int number) {
        int temp = number, lastNumber, reverseNumber = 0;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        return reverseNumber == number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("is Palindrome? --> ");
        System.out.print(isPalindromic(number));
    }
}
