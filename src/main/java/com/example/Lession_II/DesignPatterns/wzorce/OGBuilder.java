// src/main/java/com/example/Lession_II/DesignPatterns/builder/OGBuilder.java
package com.example.Lession_II.DesignPatterns.wzorce;

public class OGBuilder {

    private final String field1;
    private final int field2;
    private final boolean field3;

    private OGBuilder(Builder b) {
        this.field1 = b.field1;
        this.field2 = b.field2;
        this.field3 = b.field3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String field1;
        private int field2;
        private boolean field3;

        public Builder field1(String field1) {
            this.field1 = field1;
            return this;
        }

        public Builder field2(int field2) {
            this.field2 = field2;
            return this;
        }

        public Builder field3(boolean field3) {
            this.field3 = field3;
            return this;
        }

        public OGBuilder build() {
            return new OGBuilder(this);
        }
    }

    public String getField1() {
        return field1;
    }

    public int getField2() {
        return field2;
    }

    public boolean isField3() {
        return field3;
    }

    @Override
    public String toString() {
        return "OGBuilder{" +
                "field1='" + field1 + '\'' +
                ", field2=" + field2 +
                ", field3=" + field3 +
                '}';
    }


    static void main(String[] args) {
        OGBuilder example = OGBuilder.builder()
                .field1("Example Field")
                .field2(100)
                .field3(true)
                .build();

        System.out.println("Field1: " + example.getField1());
        System.out.println("Field2: " + example.getField2());
        System.out.println("Field3: " + example.isField3());

        example = OGBuilder.builder()
                .field1("Example Field")
                .field2(100)
                .build();

        System.out.println("Field1: " + example.getField1());
        System.out.println("Field2: " + example.getField2());
        System.out.println("Field3: " + example.isField3());
    }
}
