package Two_Pointers;

class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        StringBuilder aux = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isAlphabetic(ch))
                aux.append(Character.toLowerCase(ch));

            if (Character.isDigit(ch))
                aux.append(ch);
        }

        int start = 0, end = aux.length() - 1;
        while (start < end) {
            if (aux.charAt(start++) != aux.charAt(end--))
                return false;
        }

        return true;
    }
}