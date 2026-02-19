import java.util.Scanner;
public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        // i) Change case of string
        System.out.println("\nChanged Case:");
        String changedCase = "";
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (Character.isUpperCase(c))
                changedCase += Character.toLowerCase(c);
            else if (Character.isLowerCase(c))
                changedCase += Character.toUpperCase(c);
            else
                changedCase += c;
        }
        System.out.println(changedCase);

        // ii-a) Reverse without using predefined function
        System.out.println("\nReversed String (Without Function):");
        String reverse1 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reverse1 += str1.charAt(i);
        }
        System.out.println(reverse1);

        // ii-b) Reverse using predefined function
        System.out.println("\nReversed String (Using Function):");
        String reverse2 = new StringBuilder(str1).reverse().toString();
        System.out.println(reverse2);

        // iii) Compare two strings
        if (str1.equals(str2))
            System.out.println("\nStrings are Equal");
        else
            System.out.println("\nStrings are Not Equal");

        // iv) Insert one string into another
        System.out.print("\nEnter position to insert second string into first: ");
        int pos = sc.nextInt();

        String inserted = str1.substring(0, pos) + str2 + str1.substring(pos);
        System.out.println("After Insertion: " + inserted);

        // v) Convert to upper and lower case
        System.out.println("\nUppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        // vi) Check character presence and position
        int index = str1.indexOf(ch);
        if (index != -1)
            System.out.println("Character found at position: " + (index + 1));
        else
            System.out.println("Character not found");

        // vii) Check palindrome
        String temp = str1.replaceAll("\\s+", "").toLowerCase();
        String rev = new StringBuilder(temp).reverse().toString();
        if (temp.equals(rev))
            System.out.println("String is Palindrome");
        else
            System.out.println("String is Not Palindrome");

        // viii) Count words, vowels, consonants
        int words = str1.trim().isEmpty() ? 0 : str1.trim().split("\\s+").length;
        int vowels = 0, consonants = 0;

        for (int i = 0; i < str1.length(); i++) {
            char c = Character.toLowerCase(str1.charAt(i));
            if ("aeiou".indexOf(c) != -1)
                vowels++;
            else if (Character.isLetter(c))
                consonants++;
        }

        System.out.println("\nNumber of Words: " + words);
        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);

        sc.close();
    }
}
