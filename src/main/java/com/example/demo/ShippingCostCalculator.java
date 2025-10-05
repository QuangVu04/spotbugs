package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShippingCostCalculator {
	/**
	 * Tính chi phí vận chuyển
	 * @param trongLuong trọng lượng hàng hóa (kg)
	 * @param khoangCach khoảng cách vận chuyển (km)
	 * @return Chuỗi kết quả: "Chi phí: X VND" hoặc "Dữ liệu không hợp lệ"
	 */
	public static String tinhChiPhi(float trongLuong, float khoangCach) {
		if (trongLuong <= 0 || khoangCach <= 0) {
			return "Dữ liệu không hợp lệ";
		}

		int giaCoBan = 5000; // VND/km
		int phiVuot = 0;

		if (trongLuong > 5) {
			phiVuot = Math.round((trongLuong - 5) * 1000); // làm tròn đến số nguyên gần nhất
		}

		int tongChiPhi = (int)(khoangCach * giaCoBan + phiVuot);
		return "Chi phí: " + tongChiPhi + " VND";
	}

}
