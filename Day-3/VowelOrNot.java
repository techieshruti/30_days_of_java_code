//

import java.util.Scanner;

class VowelOrNot {
    String isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any alphabet: ");
        char c = scn.next().charAt(0);
        
        VowelOrNot sol = new VowelOrNot();
        String result = sol.isVowel(c);
        System.out.println(result);
    }
}
