package com.joker.quickweb.utils;

import java.util.List;

import com.joker.quickweb.exception.NullException;
import com.joker.quickweb.exception.NumberException;

/**
 * 基本工具类
 * @author joker
 *{@link https://github.com/Jokerblazes/jokerquickweb.git}
 */
public class WebUtils {
	private WebUtils() {}
	
	public static void isThrowNumberException(String[] array) {
		if (array.length == 0) 
			throw new NumberException();
	}
	
	public static void isThrowNumberException(List list) {
		if (list.size() == 0) 
			throw new NumberException();
	}
	
	public static void isThrowNullException(int id) {
		if (id == 0) 
			throw new NullException();
	}
	
	public static void isThrowNullException(Object record) {
		if (record == null) 
			throw new NullException();
	}
	
	
}
