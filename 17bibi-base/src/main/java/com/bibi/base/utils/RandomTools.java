package com.bibi.base.utils;

import java.util.Random;

/**
 * 随机数生成类
 * @author 刘宇	E-mail: liuyu_k26@163.com
 * @version 创建时间：2015年10月28日 上午9:52:12
 */
public class RandomTools {

	/**
	 * 随机生成字符串
	 * @param charCount
	 * @return
	 */
	public static String getRandStr(int charCount) {
		String charValue = "";
		for (int i = 0; i < charCount; i++) {
			char c = (char) (randomInt(0, 26) + 'a');
			charValue += String.valueOf(c);
		}
		return charValue;
	}
	/**
	 * 随机生成数字
	 * @param charCount
	 * @return
	 */
	public static String getRandNum(int charCount) {
		String charValue = "";
		for (int i = 0; i < charCount; i++) {
			char c = (char) (randomInt(0, 10) + '0');
			charValue += String.valueOf(c);
		}
		return charValue;
	}

	private static int randomInt(int from, int to) {
		Random r = new Random();
		return from + r.nextInt(to - from);
	}

}
