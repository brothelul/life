package com.brotherlu.life.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtil {
	/**
	 * format date to String
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String date2String(Date date, String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);	
		return format.format(date);
	}
	
	public static Date string2Date(String date, String pattern) throws ParseException {
		if(date == null) {
			return null;
		}
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.parse(date);
	}
}
