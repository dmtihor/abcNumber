public class AbcNumber {
    public int convert(String num) {
        int result = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int digit = c - 'a';
            result = result * 10 + digit;
            System.out.println(digit);
        }
        return result;
    }
}