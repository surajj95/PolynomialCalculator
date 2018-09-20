package com.company;

public class Main {

    public static void main(String[] args) {
        Polynomial first = new Polynomial();
        Polynomial second = new Polynomial();

        PolynomicOperation operation = new PolynomicOperation(first, second);
        operation.takeInput();
        Polynomial result = operation.multiply();
        result.showPolynomial("resultant");
    }
}
