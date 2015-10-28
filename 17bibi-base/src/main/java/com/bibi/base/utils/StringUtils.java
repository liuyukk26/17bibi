package com.bibi.base.utils;

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
