package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		Main main = new Main();
		int result = main.add(1, 1); // 硬编码: 测试输入值 1, 1
		assertEquals(2, result); // 硬编码: 期望结果值 2
	}

}
