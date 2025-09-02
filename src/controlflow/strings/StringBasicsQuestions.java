package controlflow.strings;

import java.util.*;

public class StringBasicsQuestions {
    //Question 1: Write a program that takes a string as input and prints the ASCII value of each character in the string.
    //Input: ABC
    //Output: 65 66 67
    public static void asciiValues(String str){
        for(int i = 0; i < str.length(); i++){
            int asciiValue = (int)str.charAt(i);
            System.out.print(asciiValue + " ");
        }
        System.out.println();
    }

    //Question 2: Count Letters, Numbers, and Special Characters in a String
    //Input: Hello123@
    //Output: 5 3 1

    public static void countLettersDigitsSpecials(String str){
        int countCharacters = 0;
        int countDigits = 0;
        int countSpecials = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isLetter(ch)){
                countCharacters++;
            }else if(Character.isDigit(ch)){
                countDigits++;
            }else {
                countSpecials++;
            }
        }

        System.out.println("Characters Count = " + countCharacters + " Digits Count = " + countDigits + " Specials Count = " + countSpecials);
    }

    //Question 3: Problem Statement
    //Write a program that takes a string as input and finds the absolute difference between the number of consonants and vowels in the string.
    //Consider only English alphabets (a–z, A–Z).
    //Ignore digits, spaces, and special characters.
    //Vowels are a, e, i, o, u (both lowercase and uppercase).
    //Consonants are all other alphabets.
    //Approach 1: Using ("aeiou".indexOf(ch) != -1)
    public static int vowelsConstantsDifference(String str){
        int vowels = 0;
        int constants = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if("aeiou".indexOf(ch) != -1){
                vowels++;
            }else {
                constants++;
            }
        }

        int difference = constants - vowels;
        return Math.abs(difference);
    }

    //Approach 2: Using HashSet
    public static void vowelsConstantsDifferenceUsingHashset(String str){
        Set<Character> vowelsSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int vowels = 0;
        int constants = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(vowelsSet.contains(ch)){
                vowels++;
            }else{
                constants++;
            }
        }

        System.out.println("Differnence Between vowels and Constants Using Hashset : " + Math.abs(constants - vowels));
    }

    //Question 4: Problem Statement
    //
    //Write a program that takes a string as input and converts all uppercase letters to lowercase and all lowercase letters to uppercase.
    //Digits and special characters should remain unchanged.
    //HelloWorld123 - Input
    //hELLOwORLD123 - Output

    public static void convertUpperCaseLowerCase(String str){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else if (Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }else {
                sb.append(ch);
            }
        }

        System.out.println("Converted String is : " + sb.toString());
    }

    //Question 5: Problem Statement
    //Write a program that takes a string as input and removes:
    //Leading spaces (spaces at the beginning).
    //Trailing spaces (spaces at the end).
    //Extra spaces between words (multiple spaces should be replaced with a single space).
    //Input :    Hello   World
    //Output : Hello World

    public static String cleanSpaceFromString(String string){
        StringBuilder sb = new StringBuilder();
        boolean isSpace = false;

        int i = 0;

        while (i < string.length() && string.charAt(i) == ' '){
            i++;
        }

        //Step 2: Process Characters
        for(; i < string.length(); i++){
            char ch = string.charAt(i);
            if(ch == ' '){
                if(!isSpace){
                    sb.append(' ');
                    isSpace = true;
                }
            }else {
                sb.append(ch);
                isSpace=false;
            }
        }


        // Step 3: Remove trailing space if present
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();

    }

    //Question 5: Problem Statement
    //Write a program that takes a string as input and counts the number of words in it.
    //A word is defined as a sequence of characters separated by spaces.
    //Ignore leading, trailing, and extra spaces (multiple spaces between words should not be counted as extra words).
    //Input: Hello World
    //Output: 2

    public static int countWordsFromTheString(String string){
        int wordsCount = 0;
        boolean isExtraSpace = false;

        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            if(ch != ' ' && !isExtraSpace){
                wordsCount++;
                isExtraSpace = true;
            }else if (ch == ' ') {
                isExtraSpace = false;
            }
        }

        return wordsCount;
    }

    //Question 6: Write a program to find the maximum and minimum occurring characters in a given string.
    //You are required to count the frequency of each character in the string (excluding spaces)
    //Then, determine the character that appears the most number of times (maximum occurring character) and the character that appears the least number of times (minimum occurring character).
    //If multiple characters have the same maximum or minimum frequency, you can return any one of them.

    //Input: string = "hello world"
    //Output: Maximum occurring character: l (3 times)
    //Minimum occurring character: h (1 time)
    public static void minimumAndMaximumCharacterFromString(String string){
        HashMap<Character, Integer> characters = new LinkedHashMap<>();

        String str = string.toLowerCase();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

//            if(ch != ' '){
//                characters.put(ch, characters.getOrDefault(ch, 0) + 1);
//            }

             if(ch != ' '){
                 if(characters.containsKey(ch)){
                     characters.put(ch, characters.get(ch) + 1);
                 }else {
                     characters.put(ch, 1);
                 }
             }
        }

        char minChar = ' ';
        char maxChar = ' ';

        int minFreq = Integer.MAX_VALUE;
        int maxFreq = Integer.MIN_VALUE;

        for(Map.Entry<Character, Integer> entry: characters.entrySet()){
            int freq = entry.getValue();
            char ch = entry.getKey();

            if(freq < minFreq){
                minFreq = freq;
                minChar = ch;
            }

            if(freq > maxFreq){
                maxFreq = freq;
                maxChar = ch;
            }
        }


        System.out.println("Minimum occurring character: '" + minChar + "' → " + minFreq + " times");
        System.out.println("Maximum occurring character: '" + maxChar + "' → " + maxFreq + " times");
    }

    //✅ When to use 26 size array (int freq[26])
    //If the string only contains lowercase English letters (a–z).
    //Mapping: freq[ch - 'a']++.
    //Space efficient → only 26 integers needed.
    //Best for interview problems when input is restricted.

    //✅ When to use 128 size array (int freq[128])
    //If the string can contain all ASCII characters (printable + special symbols).
    //Covers: a-z, A-Z, digits, punctuation, etc.
    //Safer than 26 when constraints are not clear.
    //Mapping: freq[ch]++ (since ASCII values are ≤ 127).

    //✅ When to use 256 size array (int freq[256])
    //If the string may contain extended ASCII characters (0–255).
    //Useful in some C/C++/Java problems where input might include extended symbols.
    //Covers everything 128 does, plus extended characters.
    //Mapping: freq[ch]++.

    //Above Question Using Frequency Array:
    public static void freqArrayForMinimumAndMaximumCharactersFromString(String string){
        int freq[] = new int[128];

        //Step i : entered freq of each characters from the string.
        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);

            if(ch != ' '){
                freq[ch]++;
            }
        }

        char minChar = ' ';
        char maxChar = ' ';

        int minFreq = Integer.MAX_VALUE;
        int maxFreq = Integer.MIN_VALUE;

        for(int i = 0; i < 128; i++){

            if(freq[i] != 0 && freq[i] < minFreq){
                minFreq = freq[i];
                minChar = (char) i;
            }

            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                maxChar = (char) i;
            }
        }


        System.out.println("Minimum occurring character: '" + minChar + "' → " + minFreq + " times");
        System.out.println("Maximum occurring character: '" + maxChar + "' → " + maxFreq + " times");
    }

    //Question 7: 📝 Problem Statement:
    //You are given a string s consisting of lowercase/uppercase letters or digits.
    //Your task is to check whether the string contains two consecutive identical characters or three consecutive identical characters.
    //If the string contains two consecutive identical characters, print "YES-2".
    //If the string contains three consecutive identical characters, print "YES-3".
    //If neither is found, print "NO".
    public static void hasTwoOrThreeConsecutive(String s){
       if(s == null || s.length() < 2){
           System.out.println("String is not containing minimum characters!");
       }

       boolean found2 = false;
       boolean found3 = false;


       for(int i = 0; i < s.length() - 1; i++) {
           if(s.charAt(i) == s.charAt(i + 1)) {
               found2 = true;

               if (i + 2 < s.length() && s.charAt(i) == s.charAt(i + 2)) {
                   found3 = true;
                   break;
               }
           }
       }

       if(found3){
           System.out.println("YES-3");
       }else if(found2){
           System.out.println("YES-2");
       }else {
           System.out.println("NO");
       }
    }

    //Question 8: Problem Statement:
    //You are given a string s consisting of lowercase/uppercase letters (or alphanumeric characters). Your task is to find the first occurrence index and the last occurrence index of each unique character in the string.
    //The first occurrence index of a character is the position where it appears for the first time in the string.
    //The last occurrence index of a character is the position where it appears for the last time in the string.
    //Return or display the result in a way that shows each character along with its first and last index.

    //Brute Force Approach
    public static void findFirstAndLastOccurrence(String s) {
        //Visited Array
        boolean visited[] = new boolean[256];

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            int firstIndex = -1;
            int lastIndex = -1;

            if(visited[ch] == true)
                continue;

            //To check first occurrence
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == ch){
                    firstIndex = j;
                    break;
                }
            }

            //To check last occurrence
            for(int j = s.length() - 1; j >= 0; j--){
                if(s.charAt(j) == ch){
                    lastIndex = j;
                    break;
                }
            }

            // Mark as visited
            visited[ch] = true;

            System.out.println(ch + " → First: " + firstIndex + ", Last: " + lastIndex);
        }
    }

    // Question 9: Problem Statement:
    //You are given a string s. Your task is to determine whether the string contains all the letters of the English alphabet (from 'a' to 'z') at least once, regardless of order or case.
    //Ignore case differences (i.e., 'A' and 'a' should be treated as the same letter).
    //Ignore non-alphabet characters (digits, spaces, punctuation).
    //If the string contains all 26 letters, return/print true; otherwise, return/print false.
    //Input: s = "The quick brown fox jumps over the lazy dog"
    //true
    public static boolean isContainsAllSmallLetters(String s){
        String str = s.toLowerCase();
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (str.indexOf(ch) == -1){
                    return false;
            }
        }
        return true;
    }

    //Question 10: Problem Statement:
    //You are given a string S, a character ch, and an integer k. Write a program to insert the character ch into the string at the following positions:
    //At the beginning of the string.
    //At the end of the string.
    //At the k-th position (1-based index) of the string.
    //If the given value of k is greater than the length of the string, the character should be inserted at the end.
    //Input: S = "hello"
    //ch = 'X'
    //k = 3
    //Output:
    //Xhello
    //helloX
    //heXllo
    public static void insertCharacterBruteForce(String s, char ch, int k){
        //Insert at beginning
        String insertAtBeginning = ch + s;

        //Insert at End
        String insertAtEnd = s + ch;

        String insertAtK;
        if(k > s.length()){
          insertAtK = s + ch;
        }else {
            insertAtK = s.substring(0, k - 1) + ch + s.substring(k - 1);
        }

        System.out.println("Insert At Beginning: " + insertAtBeginning);
        System.out.println("Insert At End : " + insertAtEnd);
        System.out.println("Insert At K-Position : " + insertAtK);
    }

    //Question 11: 📌 Problem Statement:
    //You are given a string S and an integer k. Write a program to remove characters from the string at the following positions:
    //The first character:
    //The last character.
    //The k-th character (1-based index)
    //If k is greater than the length of the string, then no removal should be performed for the k-th case.
    //Your program should output the new strings formed after each removal.
    public static void removeCharacters(String string, int k){
        //Remove First Characters
        String removedFirstCharacter = string.substring(1);

        //Remove Last Characters
        String removedLastCharacter = string.substring(0, string.length() - 1);

        String removedKthCharacter;

        if(k > string.length()){
            removedKthCharacter = string;
        }else {
            removedKthCharacter = string.substring(0, k - 1) + string.substring(k);
        }

        System.out.println("Removed First Character : " + removedFirstCharacter);
        System.out.println("Removed Last Character : " + removedLastCharacter);
        System.out.println("Removed Kth Character : " + removedKthCharacter);
    }

    //Question 12: 📌 Problem Statement
    //You are given two strings:
    //S (the main string)
    //P (the pattern/substring to search)
    //Write a program to check whether the substring P exists in the string S.
    //If it exists, return the starting index of its first occurrence (0-based index).
    //If it does not exist, return -1.
    public static int findSubstring(String s, String p){
        int n = s.length();
        int m = p.length();

        for(int i = 0; i <= n - m; i++){
            int j;

            for(j = 0; j < m; j++){
                if(s.charAt(i + j) != p.charAt(j)){
                    break;
                }
            }

            if(j == m){
                return i;
            }
        }

        return -1;
    }

    //Question 13: 📌 Problem Statement
    //You are given a string S of length n. Write a program to generate and print all possible substrings of the string using the brute force approach.
    //👉 A substring is a contiguous sequence of characters within the string.
    //👉 The total number of possible substrings for a string of length n is:

    public static void generateSubstring(String string){
        for(int i = 0; i < string.length(); i++){
            for(int j = i + 1; j <= string.length(); j++){
                String sub = string.substring(i, j);
                System.out.println(sub);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the String: ");
//        String str = sc.nextLine();
//        System.out.println("ASCII Values of Each Characters = ");
//        asciiValues(str);
//        countLettersDigitsSpecials(str);
//        System.out.println("Difference Between Vowels And Constants is : " + vowelsConstantsDifference(str));
//        vowelsConstantsDifferenceUsingHashset(str);

//        String string = "   Java   Programming   Language   ";
//        //convertUpperCaseLowerCase(string);
//        //System.out.println("After removing space: " + cleanSpaceFromString(string));
//        System.out.println("Words Count : " + countWordsFromTheString(string));

//        minimumAndMaximumCharacterFromString("Java Programming Language");
//        freqArrayForMinimumAndMaximumCharactersFromString("Java Programming Language");
//        hasTwoOrThreeConsecutive("helo");
//
//        String s = "banana";
//        findFirstAndLastOccurrence(s);
//
//        String s1 = "The quick brown fox jumps over the lazy";
//        System.out.println(isContainsAllSmallLetters(s1));


       String S = "hello";
       char ch = 'X';
        int k = 3;

        insertCharacterBruteForce(S, ch, k);
        removeCharacters(S, k);

        int index = findSubstring("helloworld", "world");
        if(index != -1){
            System.out.println("Substring found at index : " + index);
        }else{
            System.out.println("Substring Not Found!");
        }

        generateSubstring("abc");





    }
}
