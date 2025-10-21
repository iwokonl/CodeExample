package com.example.Lession_II.DesignPatterns.wzorce;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BuilderExample {
    private String field1;
    private int field2;
    private boolean field3;


    static void main(String[] args) {
        BuilderExample example = BuilderExample.builder()
                .field1("Example Field")
                .field2(100)
                .field3(true)
                .build();

        System.out.println("Field1: " + example.getField1());
        System.out.println("Field2: " + example.getField2());
        System.out.println("Field3: " + example.isField3());

        example = BuilderExample.builder()
                .field1("Example Field")
                .field2(100)
                .build();

        System.out.println("Field1: " + example.getField1());
        System.out.println("Field2: " + example.getField2());
        System.out.println("Field3: " + example.isField3());


    }
}
