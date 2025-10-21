package com.example.Wstęp.classes;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class ExampleClass {

    // Pola statyczne i niestatyczne oraz modyfikatory dostępu
    // Pola mają swoje modyfikatory dostępu: public, private, protected, default (package-private)
    // Zmienna publiczna statyczna jest wspólna dla całej klasy i dostępna bez tworzenia instancji
    public static String publicStaticVariable = "I am a public static variable";

    // Zmienna prywatna statyczna jest wspólna dla całej klasy, ale dostępna tylko wewnątrz klasy
    private static int privateStaticVariable = 42;

    // Zmienna prywatna instancyjna jest dostępna tylko wewnątrz klasy i wymaga instancji klasy
    private String privateInstanceVariable;

    // Zmienna publiczna instancyjna jest dostępna z dowolnego miejsca, jeśli mamy instancję klasy
    public String publicInstanceVariable;

    public ExampleClass(String privateInstanceVariable, String publicInstanceVariable) {
        this.privateInstanceVariable = privateInstanceVariable;
        this.publicInstanceVariable = publicInstanceVariable;
    }

    // Metody statyczne i niestatyczne
    // Metoda statyczna może być wywołana bez tworzenia instancji klasy
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Metoda niestatyczna wymaga instancji klasy do wywołania
    public  void method() {
        System.out.println("This is a method.");
    }


}
