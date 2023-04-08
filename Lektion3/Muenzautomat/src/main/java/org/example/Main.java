package org.example;

public class Main implements ChangeCalculator {

    @Override
    public int[] getChange(int euros, int cent) {

        if(euros < 0 || cent < 0) throw new IllegalArgumentException("Weder Cent noch Euro darf negativ sein");

        cent += euros * 100;

        int[] res = new int[8];

        while(cent >= 200) {
            cent -= 200;
            res[7]++;
        }
        while(cent >= 100) {
            cent -= 100;
            res[6]++;
        }
        while(cent >= 50) {
            cent -= 50;
            res[5]++;
        }
        while(cent >= 20) {
            cent -= 20;
            res[4]++;
        }
        while(cent >= 10) {
            cent -= 10;
            res[3]++;
        }
        while(cent >= 5) {
            cent -= 5;
            res[2]++;
        }
        while(cent >= 2) {
            cent -= 2;
            res[1]++;
        }
        while(cent == 1) {
            cent -= 1;
            res[0]++;
        }

        return res;
    }
}