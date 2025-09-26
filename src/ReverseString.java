class ReverseString {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        char[] arr = {'h','e','l','l','o'};
        reverseString.reverseString(arr);
        for (char c : arr) System.out.print(c + " ");
    }
}
