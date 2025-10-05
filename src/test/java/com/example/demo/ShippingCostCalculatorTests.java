package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ShippingCostCalculatorTests {
	// -----------------------------
	// Test biên của trọng lượng
	// -----------------------------
	// giữ khoangCach = 10
	@Test
	void testTrongLuong_BienNhoNhat() {
		assertEquals("Dữ liệu không hợp lệ", ShippingCostCalculator.tinhChiPhi(0, 10));
	}

	@Test
	void testTrongLuong_CanBienNho() {
		assertEquals("Chi phí: 50000 VND", ShippingCostCalculator.tinhChiPhi(0.01f, 10));
	}

	@Test
	void testTrongLuong_BinhThuong() {
		assertEquals("Chi phí: 50000 VND", ShippingCostCalculator.tinhChiPhi(3, 10));
	}

	@Test
	void testTrongLuong_BienTrenGiaCoBan() {
		assertEquals("Chi phí: 50000 VND", ShippingCostCalculator.tinhChiPhi(5, 10));
	}

	@Test
	void testTrongLuong_CanBienLon() {
		assertEquals("Chi phí: 50010 VND", ShippingCostCalculator.tinhChiPhi(5.01f, 10));
	}

	// -----------------------------
	// Test biên của khoảng cách
	// -----------------------------
	// giữ trongLuong = 3
	@Test
	void testKhoangCach_BienNhoNhat() {
		assertEquals("Dữ liệu không hợp lệ", ShippingCostCalculator.tinhChiPhi(3, 0));
	}

	@Test
	void testKhoangCach_CanBienNho() {
		assertEquals("Chi phí: 50 VND", ShippingCostCalculator.tinhChiPhi(3, 0.01f));
	}

	@Test
	void testKhoangCach_BinhThuong() {
		assertEquals("Chi phí: 50000 VND", ShippingCostCalculator.tinhChiPhi(3, 10));
	}

	@Test
	void testKhoangCach_CanBienLon() {
		assertEquals("Chi phí: 100000 VND", ShippingCostCalculator.tinhChiPhi(3, 20));
	}
	// -----------------------------
	// Test toàn bộ bảng quyết định 6 cột
	// -----------------------------
	@Test
	void testR1_TrongLuong0_KhoangCach0() {
		assertEquals("Dữ liệu không hợp lệ", ShippingCostCalculator.tinhChiPhi(0, 0));
	}

	@Test
	void testR2_TrongLuong0_KhoangCach5() {
		assertEquals("Dữ liệu không hợp lệ", ShippingCostCalculator.tinhChiPhi(0, 5));
	}

	@Test
	void testR3_TrongLuong3_KhoangCach0() {
		assertEquals("Dữ liệu không hợp lệ", ShippingCostCalculator.tinhChiPhi(3, 0));
	}

	@Test
	void testR4_TrongLuong3_KhoangCach10() {
		assertEquals("Chi phí: 50000 VND", ShippingCostCalculator.tinhChiPhi(3, 10));
	}

	@Test
	void testR5_TrongLuong6_KhoangCach0() {
		assertEquals("Dữ liệu không hợp lệ", ShippingCostCalculator.tinhChiPhi(6, 0));
	}

	@Test
	void testR6_TrongLuong6_KhoangCach10() {
		assertEquals("Chi phí: 51000 VND", ShippingCostCalculator.tinhChiPhi(6, 10));
	}
}
