package practice;

import org.junit.Test;
import static org.junit.Assert.*;

public class FaktorPersekutuanTest {
    @Test
    public void testAll(){
        assertEquals(6, FaktorPersekutuanPositif.jumlahFaktorPersekutuanPositif(10, -20, 15));
        assertEquals(18, FaktorPersekutuanPositif.jumlahFaktorPersekutuanPositif(10, -20, 100));
        assertEquals(1, FaktorPersekutuanPositif.jumlahFaktorPersekutuanPositif(5, 7, 19));
    }
}
