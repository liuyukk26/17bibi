package com.bibi.base.utils;

import java.util.ArrayList;
import java.util.List;

public class ArrayTools{
	/**
	 * 将[a,b,c,d]格式的字符串转为String[]{a,b,c,d}格式
	 * @param str
	 * @return
	 */
	public static List<String> toStringList(String str){
		List<String> list = new ArrayList<String>();
		if(str!=null&&!str.equals("")){
			String temp = str.substring(0,str.length()-1).substring(1);
			String[] ss = temp.split(",");
			for (String e : ss) {
				list.add(e.trim());
			}
		}
		return list;
	}
	/**
	 * 将"a,b,c,d"格式的字符串转为String[]{a,b,c,d}格式
	 * @param str
	 * @return
	 */
	public static List<String> toStringListNormal(String str){
		List<String> list = new ArrayList<String>();
		if(str!=null&&!str.equals("")){
			String[] ss = str.split(",");
			for (String e : ss) {
				list.add(e.trim());
			}
		}
		return list;
	}
	/**
	 * 将[2l,3l,4l,5l]格式的字符串转为Long[]{2l,3l,4l,5l}List格式
	 * @param str
	 * @return
	 */
	public static List<Long> toLongList(String str){
		List<Long> list = new ArrayList<Long>();
		if(str!=null&&!str.equals("")){
			String temp = str.substring(0,str.length()-1).substring(1);
			String[] ss = temp.split(",");
			for (String e : ss) {
				list.add(Long.parseLong(e.trim()));
			}
		}
		return list;
	}
	
	/**
	 * 将[1,2,3,4]格式的字符串转为Integer[]{1,2,3,4}List格式
	 * @param str
	 * @return
	 */
	public static List<Integer> toIntList(String str){
		List<Integer> list = new ArrayList<Integer>();
		if(str!=null&&!str.equals("")){
			String temp = str.substring(0,str.length()-1).substring(1);
			String[] ss = temp.split(",");
			for (String e : ss) {
				list.add(Integer.parseInt(e.trim()));
			}
		}
		return list;
	}
}