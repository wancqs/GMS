package com.lp.gms.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {
	/**
	 * md5加密算法
	 * 
	 * @param plainText
	 *            加密原文
	 * 
	 * 
	 * @return 加密后密文
	 */
	public static String md5(String plainText) {
		byte[] secretBytes = null;
		try {
			secretBytes = MessageDigest.getInstance("md5").digest(
					plainText.getBytes());
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("登陆出现错误！");
		}
		return new BigInteger(1, secretBytes).toString(16);
	}
}
