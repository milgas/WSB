import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramyTest {

    @Test
    public void testIsAnagram() {
        assertTrue(Anagramy.isAnagram("zamek", "ekzam"));
        assertTrue(Anagramy.isAnagram("kot", "tok"));
        assertFalse(Anagramy.isAnagram("zamek", "zamek "));
        assertFalse(Anagramy.isAnagram("kot", "pies"));
    }
}