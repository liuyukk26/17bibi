package com.bibi.base.utils;

/**
 * 字符串工具类
 * @author 刘宇	E-mail: liuyu_k26@163.com
 * @version 创建时间：2015年10月28日 上午9:52:43
 */
public class StringUtils {
	
	public static boolean isNull(String str){
		if(str != null && !"".equals(str.trim())){
			return false;
		}else{
			return true;
		}
	}
	
	//判断字符串不为空
	public static boolean isNotNull(String str){
		if(str != null && !"".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}
	
	public static String transferredUrlForJSON(String url){
		if(!isNull(url)){
			url.replaceAll("\\", "/");
			return url;
		}else{
			return null;
		}
	}
	
}
