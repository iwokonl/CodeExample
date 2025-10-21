package com.example.Wstęp;

public class EqualsExamples {

    static void main(String[] args) {
        String str1 = new String("example");
        String str2 = new String("example");

        System.out.println("Using '==': " + (str1 == str2)); // false, different references
        System.out.println("Using 'equals()': " + str1.equals(str2)); // true, same content

        System.out.println();

        System.out.println("String pool example:");
        String str1Pool = new String("example").intern();
        String str2Pool = new String("example").intern();

        System.out.println("Using '==': " + (str1Pool == str2Pool)); // false, different references
        System.out.println("Using 'equals()': " + str1Pool.equals(str2Pool)); // true, same content

        System.out.println();

        System.out.println("Automatic string pooling:");
        String strLiteral1 = "example";
        String strLiteral2 = "example";

        System.out.println("Using '==': " + (strLiteral1 == strLiteral2)); // false, different references
        System.out.println("Using 'equals()': " + strLiteral1.equals(strLiteral2)); // true, same content

        System.out.println();
        String strLiteral3 = "example";
        String strLiteral4 = null;

        System.out.println("Using 'equals()' with null safe: " + strLiteral3.equals(strLiteral4)); // false, strLiteral4 is null
        System.out.println("Using 'equals()' with null: " + strLiteral4.equals(strLiteral3)); // false, strLiteral4 is null
    }


}
