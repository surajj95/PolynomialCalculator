package com.company;

public class PolynomicOperation {

    private Polynomial firstPolynomial, secondPolynomial;

     PolynomicOperation(Polynomial firstPolynomial, Polynomial secondPolynomial) {
        this.firstPolynomial = firstPolynomial;
        this.secondPolynomial = secondPolynomial;
     }

     void takeInput() {
        System.out.println("Please enter your first Polynomial");
        this.firstPolynomial.takeInput();
        System.out.println("Please enter your second Polynomial");
        this.secondPolynomial.takeInput();

        this.firstPolynomial.showPolynomial("first");
        this.secondPolynomial.showPolynomial("second");
     }

     /**
     * Multiplies the two polynomials.
     */
     Polynomial multiply() {
         int first[] = firstPolynomial.getmPolynomial();
         int second [] = secondPolynomial.getmPolynomial();
         int firstLength = first.length;
         int secondLength = second.length;
         int resultantLength = ( firstLength - 1)+ (secondLength - 1);
         int result[] = new int[resultantLength+1];
         Polynomial resultant = new Polynomial();
         for (int i = firstLength - 1; i>-1; i--) {
            for (int j = secondLength - 1; j>-1; j--) {
                int exponent = i+j;
                int coefficient = result[exponent] + first[i]*second[j];
                result[exponent] = coefficient;
            }
         }
         resultant.setmPolynomial(result);
         return resultant;
     }
}
