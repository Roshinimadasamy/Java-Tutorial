package day11;
import java.util.*;
public class anagramcheck {
    public static void main(String[] args) {
        String name = "listen";
        String name1 = "silent";
        if (name.length() != name1.length()) {
            System.out.println("not an anagram");
        }
        char[] char1 = name.toCharArray();
        char[] char2 = name1.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        if (Arrays.equals(char1, char2)) {
            System.out.println("it is a anagram");
        } else {
            System.out.println("nota anagram");
        }
    }
}
