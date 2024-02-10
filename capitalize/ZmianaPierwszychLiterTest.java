import org.junit.Test;

import static org.junit.Assert.*;

public class PierwszeLiteryTest {

    @Test
    public void testZmienPierwszeLitery() {
        assertEquals("Ala Ma Kota.", PierwszeLitery.zmienPierwszeLitery("ala ma kota."));
        assertEquals("Kot Ma Długi Ogon.", PierwszeLitery.zmienPierwszeLitery("kot ma długi ogon."));
        assertEquals("Ala Ma   Kota.", PierwszeLitery.zmienPierwszeLitery("ala ma   kota."));
    }
}