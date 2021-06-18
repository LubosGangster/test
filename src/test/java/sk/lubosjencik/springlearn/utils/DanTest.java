package sk.lubosjencik.springlearn.utils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest
class DanTest {

    @Test
    void pripocitajDan1() {
        assertEquals(BigDecimal.valueOf(120L), Dan.pripocitajDan(BigDecimal.valueOf(100L)));
    }

    @Test
    void pripocitajDan2() {
        assertEquals(BigDecimal.valueOf(169.20).setScale(2), Dan.pripocitajDan(BigDecimal.valueOf(141L)).setScale(2));
    }

    @Test
    public void suma10plusDanNieJe1000(){
        assertNotEquals(BigDecimal.valueOf(1000), Dan.pripocitajDan(BigDecimal.valueOf(10L)).setScale(2));
    }
}