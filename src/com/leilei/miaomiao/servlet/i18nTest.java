package com.leilei.miaomiao.servlet;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;

public class i18nTest {
	@Test
	public void testReBound(){
		Locale locale = Locale.US;
		ResourceBundle bundle  = ResourceBundle.getBundle("i18n", locale);
		String dateLable = bundle.getString("date");
		String salLable = bundle.getString("salary");
		String str = "{0}　:　{1}  ; {2}　:　{３}";
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
		String formDate = dateFormat.format(date);
		Double sal = 214234.56d;
		NumberFormat format = NumberFormat.getCurrencyInstance(locale);
		String formNum = format.format(sal);
		String result = MessageFormat.format(str, dateLable,formDate,salLable,formNum);
		System.out.println(result);
	}
	public void testMessage(){
		String str = "Date : {0}  , Salary : {1}";
		Locale locale = Locale.CHINA;
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
		String formDate = dateFormat.format(date);
		Double sal = 214234.56d;
		NumberFormat format = NumberFormat.getCurrencyInstance(locale);
		String formNum = format.format(sal);
		String result = MessageFormat.format(str, formDate,formNum);
		System.out.println(result);
		
	}
	@Test
	public void testNumber() throws ParseException{
		Locale locale  = Locale.CHINA;
		Double d= 1324324234.345d;
		NumberFormat  format = NumberFormat.getNumberInstance(locale);
		NumberFormat format2 = NumberFormat.getCurrencyInstance(locale);
	/*	String numFormat = format.format(d);
		String curFormat = format2.format(d);
		System.out.println(numFormat);
		System.out.println(curFormat);*/
		String str1 = "1,324,324,234.345";
		String str2= "￥1,324,324,234.345";
		Double d1 = (Double) format.parse(str1);
		Double d2 = (Double) format2.parse(str2);
		System.out.println(d1);
		System.out.println(d2);
		
	}
	public void testDate(){
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String dateForm  = dateFormat.format(date);
		System.out.println(dateForm);
	}
	public void testDateFormat2() throws ParseException{
		String str = "1997-05-19-13:25:56";
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss");
	
		Date strDate = dateFormat.parse(str);
		System.out.println(strDate);
		
	}
	public void testDataFormat(){
		Locale locale  = Locale.CHINA;
		Date  date = new Date();
		DateFormat dateFormat  = DateFormat.getDateTimeInstance(DateFormat.FULL,
				DateFormat.FULL, locale);
		String str = dateFormat.format(date);
		System.out.println(str);
		
		
		
	}
	public void testI18n(){
		Locale  locale  = Locale.JAPAN;
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getLanguage());
		
		
	}

}
