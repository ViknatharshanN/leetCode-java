import java.util.Arrays;

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        String str1 = "anagram";
        String str2 = "nagaram";
        System.out.println(validAnagram.isAnagram(str1, str2));
    }
}
