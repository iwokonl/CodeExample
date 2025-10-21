package com.example.Lession_II.DesignPatterns.wzorce;

public interface IOGBuilder {
    IOGBuilder setField1(String field1);
    IOGBuilder setField2(int field2);
    IOGBuilder setField3(boolean field3);
    OGBuilder build();
}
