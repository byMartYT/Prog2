package org.example;

public class Main implements ChangeCalculator {

    @Override
    public int[] getChange(int euros, int cent) {

        if(euros < 0 || cent < 0) throw new IllegalArgumentException("Weder Cent noch Euro darf negativ sein");

        cent += euros * 100;

        int[] res = new int[8];

        while(cent >= Coin.EURO_2.value) {
            cent -= Coin.EURO_2.value;
            res[7]++;
        }
        while(cent >= Coin.EURO_1.value) {
            cent -= Coin.EURO_1.value;
            res[6]++;
        }
        while(cent >= Coin.CENT_50.value) {
            cent -= Coin.CENT_50.value;
            res[5]++;
        }
        while(cent >= Coin.CENT_20.value) {
            cent -= Coin.CENT_20.value;
            res[4]++;
        }
        while(cent >= Coin.CENT_10.value) {
            cent -= Coin.CENT_10.value;
            res[3]++;
        }
        while(cent >= Coin.CENT_5.value) {
            cent -= Coin.CENT_5.value;
            res[2]++;
        }
        while(cent >= Coin.CENT_2.value) {
            cent -= Coin.CENT_2.value;
            res[1]++;
        }
        while(cent == Coin.CENT_1.value) {
            cent -= Coin.CENT_1.value;
            res[0]++;
        }

        return res;
    }
}