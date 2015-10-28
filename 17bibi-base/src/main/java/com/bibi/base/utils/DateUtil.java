package com.bibi.base.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	/**
	 * 将yyyy-MM-dd格式的日期字符转换成时间戳
	 * @param strDate
	 * @return
	 */
	public static Long parseYMDToLong(String strDate){
		
		
		if(strDate!=null&&!"".equals(strDate)){
			try {
				Date date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
				return date.getTime();
			} catch (ParseException e) {
				e.printStackTrace();
				return null;
			}
		}else{
			return null;
		}
	}
	
	/**
	 * 将yyyy-MM-dd HH:mm格式的日期字符转换成时间戳
	 * @param strDate
	 * @return
	 */
	public static Long parseYMDHMToLong(String strDate){				
		if(strDate != null && !"".equals(strDate)){
			try {
				Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(strDate);
				return date.getTime();
			} catch (ParseException e) {
				e.printStackTrace();
				return null;
			}
		}else{
			return null;
		}
	}
	
	/**
	 * 将时间戳转换成yyyy-MM-dd格式的日期字符
	 * @param time
	 * @return
	 */
	public static String parseLongToYMD(Long time){
		if(time!=null){
			Date date = new Date(time);
			return new SimpleDateFormat("yyyy-MM-dd").format(date);
		}else{
			return null;
		}
	}
	
	/**
	 * 将时间戳转换成yyyy-MM-dd hh:mm:ss格式的日期字符
	 * @param time
	 * @return
	 */
	public static String parseLongToYMDHMS(Long time){
		if(time!=null){
			Date date = new Date(time);
			return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
		}else{
			return null;
		}
	}
	
	/**
	 * 计算日期
	 * @param date 目标日期
	 * @param vector 偏移矢量
	 * @return
	 */
	public static Long computeDate(Long date,Integer vector){
		return date + (86400000 * vector);
	}
	
	
	
}
