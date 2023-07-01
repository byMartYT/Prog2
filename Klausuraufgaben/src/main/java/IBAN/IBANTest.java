package IBAN;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class IBANTest {

    @Test
    public void testCorrectIban() {
        try {
        assertTrue(IBAN.ibanCheck("DE213012040000BYI15228"));
        } catch (IBAN.FalscheIBANException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testWrongIban(){
        String iban = "GB213012040000BYI15228";
        assertThrows(IBAN.FalscheIBANException.class, () -> IBAN.ibanCheck(iban), iban + "\"Dies ist keine Deutsche IBAN. Die ersten beiden Stellen müssen \\\"DE\\\" sein\"");
    }

    @Test
    public void testIbanTooLong() {
        String iban = "GB213012040000BYI152285";
        assertThrows(IBAN.FalscheIBANException.class, () -> IBAN.ibanCheck(iban), iban +" ist zu kurz\"");
    }

    @Test
    public void testIbanTooShort() {
        String iban = "GB213012040000BYI1522";
        assertThrows(IBAN.FalscheIBANException.class, () -> IBAN.ibanCheck(iban), iban +" ist zu lang\"");
    }
}
