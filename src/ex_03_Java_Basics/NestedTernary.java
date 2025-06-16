package ex_03_Java_Basics;

public class NestedTernary {
    public static void main(String[] args) {
        int marks = 91;
        String result = marks > 90 ? "A+" : (marks > 75) ? "A" : (marks > 60) ? "B" : (marks > 40) ? "C" : "fail";
        System.out.println(result);
    }
}
