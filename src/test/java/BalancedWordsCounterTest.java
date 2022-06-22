import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedWordsCounterTest {

    private final BalancedWordsCounter balancedWordsCounter=new BalancedWordsCounter();

    @Test
    void correctString() throws Exception {
        String s="aabbabcccba";
        assertEquals(28,balancedWordsCounter.count(s));
    }

    @Test
    void emptyString() throws Exception {
        String s="";
        assertEquals(0,balancedWordsCounter.count(s));
    }

    @Test
    void incorrectString() throws Exception {
        String s="abababa1";
        assertThrows(RuntimeException.class,()->{balancedWordsCounter.count(s);});
    }

    @Test
    void nullString() throws Exception {
        String s=null;
        assertThrows(RuntimeException.class,()->{balancedWordsCounter.count(s);});
    }
}