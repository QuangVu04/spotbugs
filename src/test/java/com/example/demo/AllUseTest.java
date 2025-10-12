package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllUseTest {
    @Test
    void testTrongLuong_AllUses() {
        // TC1: trongLuong (1,5)
        String result = ShippingCostCalculator.tinhChiPhi(6, 10);
        assertEquals("Chi phí: 51000 VND", result);
    }

    @Test
    void testKhoangCach_AllUses() {
        // TC2: khoangCach (1,5)
        String result = ShippingCostCalculator.tinhChiPhi(4, 10);
        assertEquals("Chi phí: 50000 VND", result);
    }

    @Test
    void testPhiVuot_AllUses() {
        // TC3: phiVuot (4,5)
        String result = ShippingCostCalculator.tinhChiPhi(7, 1);
        assertEquals("Chi phí: 7000 VND", result);
    }

    @Test
    void testTongChiPhi_AllUses() {
        // TC4: tongChiPhi (5,6)
        String result = ShippingCostCalculator.tinhChiPhi(6, 10);
        assertEquals("Chi phí: 51000 VND", result);
    }

    @Test
    void testInvalidInput() {
        // TC5: Invalid branch (1,2(F))
        String result = ShippingCostCalculator.tinhChiPhi(-1, 10);
        assertEquals("Dữ liệu không hợp lệ", result);
    }
}
