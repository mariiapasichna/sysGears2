package com.mariiapasichna;

public class Crane {

    /*
    We want to transfer n plates from car A to car C using place B. We use the following recursive scheme:
· transfer n - 1 plates from car A to place B using car C;
· transfer the plate from car A to car C;
· transfer n - 1 plates from place B to car C using car A
*/

    public static void craneShippingAlgorithm(int numberOfPlates, String from, String to, String additional) {
        if (numberOfPlates == 0) return;
        craneShippingAlgorithm(numberOfPlates - 1, from, additional, to);
        System.out.println("#" + numberOfPlates + " " + from + " -> " + to);
        craneShippingAlgorithm(numberOfPlates - 1, additional, to, from);
    }
}