package com.company;

import java.util.Scanner;

class Polynomial {

    private int[] mPolynomial;

    int[] getmPolynomial() {
        return mPolynomial;
    }

    public void setmPolynomial(int[] mPoynomial) {
        this.mPolynomial = mPoynomial;
    }

    /**
     * Takes polynomial as an input in the array.
     * Considering the indexes of the array to be power of x
     * and values corresponding to the indexes as the coefficients of
     * the respective polynomial's degree (power -> index)
     * Example - 4x^2 + 2x^1 + 1x^0 -> [1,2,4]
     */
    void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter degree of your polynomial: ");
        int degree = sc.nextInt();
        this.mPolynomial = new int[degree+1];
        for (int i = degree; i>-1; i--) {
            System.out.print("Enter coefficient for x^"+i+": ");
            this.mPolynomial[i] = sc.nextInt();
        }
    }

    /**
     * Shows the polynomial represented by this class
     */
    void showPolynomial (String which) {
        System.out.print("The "+which+" is: ");
        for (int i = this.mPolynomial.length -1; i>-1; i--) {
            if (i>1) {
                System.out.print(mPolynomial[i]+"x^"+i+"+");
            } else if (i == 1) {
                System.out.print(mPolynomial[i]+"x");
            } else {
                System.out.print("+"+ mPolynomial[i]);
            }
        }
        System.out.println();
    }
}
