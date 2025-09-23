package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		// --- Bắt đầu code bừa để SpotBugs cảnh báo ---

		// 1. Dead store (biến không dùng)
		int unusedVar = 10;

		// 2. Null pointer khả năng xảy ra
		String str = null;
		if (str.equals("test")) { // SpotBugs: NP_NULL_ON_SOME_PATH
			System.out.println("Matched");
		}

		// 3. So sánh String bằng == thay vì .equals()
		String a = "hello";
		String b = "hello";
		if (a == b) { // SpotBugs: EQ_COMPARETO_USE
			System.out.println("Strings are equal");
		}

		// 4. Chia cho 0 tiềm ẩn
		int x = 5;
		int y = 0;
		int z = x / y; // SpotBugs: DIVIDE_BY_ZERO

		// 5. Unused return value
		String result = "abc".replace("a", "A"); // không dùng result
		"abc".replace("a", "A"); // SpotBugs: URF_UNREAD_FIELD
	}

}
