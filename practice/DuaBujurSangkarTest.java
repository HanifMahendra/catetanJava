package practice;

import org.junit.Test;
import static org.junit.Assert.*;

public class DuaBujurSangkarTest {
    
    @Test
    public void testAll(){
        assertEquals("Terpisah", DuaBujurSangkar.statusDuaBujurSangkar(-1, 3, 2, 4, 4));
        assertEquals("Di dalam", DuaBujurSangkar.statusDuaBujurSangkar(3, 3, 2, 4, 4));
        assertEquals("Beririsan", DuaBujurSangkar.statusDuaBujurSangkar(1, 3, 2, 4, 4));
    }
}
