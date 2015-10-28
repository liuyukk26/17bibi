package com.bibi.base.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * 当前用户ip相关处理
  @Name: IPUtil.java 
  @Author: admin 
  @Date: 2014年11月12日 
  @Description:
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
