package ex_03_Java_Basics;


public class Operators {
//    Program 1: Find Max of Two Numbers using Ternary Operators.
//    Description: Uses ternary operator to compare a and b and print the maximum value.A =10, B= 20;
public static void main (String []args){
    int a = 10;
    int b = 20;
    int max = a > b ? a : b;
    int min = b < a ? b : a;
 System.out.println(max);
 System.out.println(min);
}
}