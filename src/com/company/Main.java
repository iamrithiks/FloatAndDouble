package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloat  = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloat);
        System.out.println("Float Maximum Value = " + myMaxFloat);

        double myMinDouble  = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDouble);
        System.out.println("Double Maximum Value = " + myMaxDouble);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);
    }
}