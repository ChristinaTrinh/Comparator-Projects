package BasicStringComparator;

import java.util.*;

public class IntroToComparator {
    public static void main(String[] args) {
        String codeWords[] = { "Foxtrot", "alpha", "echo", "golf", "bravo", "hotel", "Charlie", "DELTA" };

        // codeWords[0] "Foxtrot" compareTo codeWords[i] via regular String Comparable
        System.out.println("codeWords[0] \"Foxtrot\" compareTo codeWords[i] via regular String Comparable  : ");
        for (int i = 0; i < codeWords.length; i++)
            System.out.println(
                    "\t" + codeWords[0] + ".compareTo(" + codeWords[i] + ") = " + codeWords[0].compareTo(codeWords[i]));
        System.out.println();

        // This isn't sorted yet
        System.out.print("codeWords: ");
        System.out.print("[");
        for (int i = 0; i < codeWords.length - 1; i++)
            System.out.print(codeWords[i] + ", ");
        System.out.println(codeWords[codeWords.length - 1] + "]");
        System.out.println();

        // This sorts based on case-sensitive, so the capitals go first
        System.out.print("codeWords sorted based on case-sensitive order: ");
        Arrays.sort(codeWords);
        System.out.print("[");
        for (int i = 0; i < codeWords.length - 1; i++)
            System.out.print(codeWords[i] + ", ");
        System.out.println(codeWords[codeWords.length - 1] + "]");
        System.out.println();

        // This sorts based on case-insensitive, so it goes by alphabetically order
        // The capitalization doesn't matter
        System.out.print("codeWords sorted based on case-insensitive order: ");
        Arrays.sort(codeWords, String.CASE_INSENSITIVE_ORDER);
        System.out.print("[");
        for (int i = 0; i < codeWords.length - 1; i++)
            System.out.print(codeWords[i] + ", ");
        System.out.println(codeWords[codeWords.length - 1] + "]");
        System.out.println();

        // This sorts based on length, so the sorter strings go before the longer
        // strings
        System.out.print("codeWords sorted based on length of strings: ");
        Arrays.sort(codeWords, new LengthComparator());
        System.out.print("[");
        for (int i = 0; i < codeWords.length - 1; i++)
            System.out.print(codeWords[i] + ", ");
        System.out.println(codeWords[codeWords.length - 1] + "]");
        System.out.println();

        // This sorts based on the last characters of the strings
        // Strings with "smaller" last characters go first (capitals go first)
        System.out.print("codeWords sorted based on last character: ");
        Arrays.sort(codeWords, new lastCharacterOrderComparator());
        System.out.print("[");
        for (int i = 0; i < codeWords.length - 1; i++)
            System.out.print(codeWords[i] + ", ");
        System.out.println(codeWords[codeWords.length - 1] + "]");
        System.out.println();

        // This sorts based on the first characters of the strings
        // Strings that have "smaller" first characters go first (Capitals go first)
        System.out.print("codeWords sorted based on first character: ");
        Arrays.sort(codeWords, new firstCharacterOrderComparator());
        System.out.print("[");
        for (int i = 0; i < codeWords.length - 1; i++)
            System.out.print(codeWords[i] + ", ");
        System.out.println(codeWords[codeWords.length - 1] + "]");
        System.out.println();
    }
}
