import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromTest {

    @Test
    public void testIsPalindrom() {
        assertTrue(Palindrom.isPalindrom("kobyła ma mały bok"));
        assertTrue(Palindrom.isPalindrom("Radar"));
        assertTrue(Palindrom.isPalindrom("A"));

        assertFalse(Palindrom.isPalindrom("Ala ma kota"));
        assertFalse(Palindrom.isPalindrom("Kot ma kota"));
        assertFalse(Palindrom.isPalindrom(""));
        assertFalse(Palindrom.isPalindrom(null));
    }
}