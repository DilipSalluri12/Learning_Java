package ex_04_Java_Basics_Strings;

public class StringManipulationQ3 {
    public static void main(String[] args) {
        int iterations = 1000;
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String: " + (endTime - startTime) + "ms");
    }
}