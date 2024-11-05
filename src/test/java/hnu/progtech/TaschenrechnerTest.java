package hnu.progtech;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaschenrechnerTest {

    @Test
    void addTest() {
        Taschenrechner tr = new Taschenrechner(0);
        tr.add(10);
        tr.add(2);
        assertEquals(12, tr.getResult());
    }

    @Test
    void sqrtTest() {
        Taschenrechner tr = new Taschenrechner(0);
        tr.add(9);
        //tr.sqrt();
        assertEquals(3, tr.getResult());
    }


}