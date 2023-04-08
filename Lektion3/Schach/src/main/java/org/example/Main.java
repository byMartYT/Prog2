package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Main {
    @Test
    public void testGibMarkierteFelder(){
        Figur laeufer = new LaeuferImpl(3,4);
        Brett b = laeufer.gibErlaubteFelder();

        for(boolean[] ba : b.brett) {
            for(boolean bf : ba) {
                System.out.printf("%c", bf ? 'X' : '0');
            }
            System.out.println();
        }

    }
}