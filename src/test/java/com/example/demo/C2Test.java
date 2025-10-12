package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class C2Test {
    @Test
    void testInvalidInput_TrongLuongZero() {
        // 1(T) - 2
        float trongLuong = 0;
        float khoangCach = 1;
        String expected = "Dữ liệu không hợp lệ";
        String actual = ShippingCostCalculator.tinhChiPhi(trongLuong, khoangCach);
        assertEquals(expected, actual);
    }

    @Test
    void testVuotTrongLuong() {
        // 1(F) - 3 - 4(T) - 5 - 6 - 7
        float trongLuong = 6; // > 5kg
        float khoangCach = 1;
        String expected = "Chi phí: 6000 VND";
        String actual = ShippingCostCalculator.tinhChiPhi(trongLuong, khoangCach);
        assertEquals(expected, actual);
    }

    @Test
    void testTrongLuongDuoi5kg() {
        // 1(F) - 3 - 4(F) - 6 - 7
        float trongLuong = 4; // <= 5kg
        float khoangCach = 1;
        String expected = "Chi phí: 5000 VND";
        String actual = ShippingCostCalculator.tinhChiPhi(trongLuong, khoangCach);
        assertEquals(expected, actual);
    }
}