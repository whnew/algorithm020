package week9;

/**
 * 541. 反转字符串 II
 */
public class ReverseStr {
    public static void main(String[] args) {
        reverseStr("abcdefg", 8);
    }
    public static String reverseStr(String s, int k) {
        if(s == null || s.length() == 0 ){
            return s;
        }
        char[] chars = s.toCharArray();
        int len = s.length();
        for (int i = 0; i < len; i = i + 2*k) {
            swap(chars, i, i + k-1);
        }
        System.out.println("aaa");
        return String.valueOf(chars);
    }

    public static void swap(char[] chars, int begin, int end){
        if(end >= chars.length){
            end = chars.length - 1;
        }
        while (begin < end){
            char temp = chars[begin];
            chars[begin] = chars[end];
            chars[end] = temp;
            begin++;
            end--;
        }
    }
}
