package ex_04_Java_Basics_Strings;

public class StringManipulation {
    public static void main(String[] args) {
        String s1 = "Hello World";
        char ch = s1.charAt(0);
        String result = s1.substring(6,11);

        System.out.println(s1.length());
        System.out.println(ch);
        System.out.println(result);

    }
}
