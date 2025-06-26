package ex_04_Java_Basics_Strings;
//Program compares strings using various methods
public class StringManipulationQ2 {
    public static void main(String[] args) {
     String s1 = "Hello";
     String s2 = "hello";
     String s3 = "Hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.compareTo(s2));
    }
}
