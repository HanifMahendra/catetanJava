package practice;

import org.junit.Test;
import static org.junit.Assert.*;

public class reversedWordsTest {
    
    @Test
    public void testReversedWords(){
        assertEquals("irotuY", reversedWords.reverseWords("Yutori"));
        assertEquals("sihT si irotuY nrael !emit", reversedWords.reverseWords("This is Yutori learn time!"));
        assertEquals("Yutori ", reversedWords.reverseWords("irotuY "));
    }
}
