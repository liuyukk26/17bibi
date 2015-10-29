package com.bibi.base.utils;

import java.io.UnsupportedEncodingException;
import java.security.SignatureException;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * MD5加密
 * @author 刘宇	E-mail: liuyu_k26@163.com
 * @version 创建时间：2015年10月28日 上午9:51:30
 */
public class MD5Utils {

	/**
	 * MD5算法加密密码
	 * 
	 * @param plainText
	 *            加密原文
	 * @return cipherText 加密密文
	 */
	public static String md5(String plainText) {
		
		String secret = "";
		try {
			secret =  DigestUtils.md5Hex(getContentBytes(plainText, "UTF-8"));
		} catch (Exception e) {
			throw new RuntimeException("MD5加密失败");
		}
		return secret;
	}
	
	/**
     * @param content
     * @param charset
     * @return
     * @throws SignatureException
     * @throws UnsupportedEncodingException 
     */
    private static byte[] getContentBytes(String content, String charset) {
        if (charset == null || "".equals(charset)) {
            return content.getBytes();
        }
        try {
            return content.getBytes(charset);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("MD5签名过程中出现错误,指定的编码集不对,您目前指定的编码集是:" + charset);
        }
    }

}