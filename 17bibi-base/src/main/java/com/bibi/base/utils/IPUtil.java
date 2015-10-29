package com.bibi.base.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * 当前用户ip相关处理
 * @author 刘宇	E-mail: liuyu_k26@163.com
 * @version 创建时间：2015年10月28日 上午9:46:22
 */
public class IPUtil {
	/**
	 *  获取当前用户访问ip
	 */
	public static String getIpAddr(HttpServletRequest request) {  
	    String ip = request.getHeader("x-forwarded-for");  
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	        ip = request.getHeader("Proxy-Client-IP");  
	    }  
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	        ip = request.getHeader("WL-Proxy-Client-IP");  
	    }  
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
	        ip = request.getRemoteAddr();  
	    }  
	    return ip;  
	}  
}
