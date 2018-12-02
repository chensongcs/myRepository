package com.chensong.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.chensong.exception.CsException;


public class DateUtil {
	
	/**
	 * 根据输入日期格式返回当前日期字符串
	 * @param format
	 * @return
	 * @throws CsException
	 */
	public static String getCurrentTime(String format) throws CsException{
		Date date = new Date();
		SimpleDateFormat sdf = null;
		switch (format) {
		case "yyyy-MM-dd":
			sdf = new SimpleDateFormat("yyyy-MM-dd");
			break;
		case "yyyy-MM-dd hh:mm:ss":
			sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			break;
		default:
			throw new CsException("日期格式错误");
		}
		return sdf.format(date);
	}
	
	/**
	 * 根据输入的起始，终止日期返回中间所有日期集合（支持yyyy-MM-dd）
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static List<String> getDateList(String startDate,String endDate){
		return new ArrayList<String>();
	}
	
	
}
