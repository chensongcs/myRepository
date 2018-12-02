package com.chensong.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.chensong.exception.CsException;


public class DateUtil {
	
	/**
	 * �����������ڸ�ʽ���ص�ǰ�����ַ���
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
			throw new CsException("���ڸ�ʽ����");
		}
		return sdf.format(date);
	}
	
	/**
	 * �����������ʼ����ֹ���ڷ����м��������ڼ��ϣ�֧��yyyy-MM-dd��
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static List<String> getDateList(String startDate,String endDate){
		return new ArrayList<String>();
	}
	
	
}
