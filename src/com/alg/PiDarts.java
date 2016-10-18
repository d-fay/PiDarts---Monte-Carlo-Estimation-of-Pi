package com.alg;

import java.lang.Math;

public class PiDarts {

    public static void main(String[] args) {
        int numDarts = 1000;
        int numInsideCircle = 0;
        int numOutsideCircle = 0;
        double quarterPi;

        // maintains a count of the amount of darts thrown
        for (int count = 0; count < numDarts; count++) {
            boolean newDartInCircle = throwDart();

            // Count darts inside and outside of circle
            if (newDartInCircle == true) { numInsideCircle++; }
            else { numOutsideCircle++; }
        }

        quarterPi = computeQuarterPi(numInsideCircle, numOutsideCircle);    // calculate Pi/4
        printDouble(quarterPi); // print results (Pi/4)

    }

    // Throw a dart at random location and return boolean
    // returns true if dart is inside of circle
    public static boolean throwDart() {
        double x = Math.random();
        double y = Math.random();
        boolean result = false;
        if ( x * x + y * y <= 1 ) {
            result = true;
        }
        return result;
    }

    // Computes and returns the value of Pi/4
    // @param numInside Number of darts inside circle
    // @param numOutside Number of darts outside the circle
    public static double computeQuarterPi(double numInside, double numOutside) {
        double numTotalDarts = numInside + numOutside;  // compute the total number of darts thrown
        System.out.println("Number of darts thrown: " + (int)numTotalDarts); // printDouble total num darts thrown
        double quarterPi = numInside/(numTotalDarts);   // compute the value Pi/4
        return quarterPi;
    }


    public static void printDouble(double result) {
        System.out.println("Pi/4 = " + result);
        System.out.println("Pi = " + 4 * result);
    }
}
