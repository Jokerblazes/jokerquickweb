package com.joker.quickweb.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.joker.jokerORM.util.MajorKey;

/**
 * 反射工具类
 * @author joker
 *{@link https://github.com/Jokerblazes/jokerquickweb.git}
 */
public class ReflectionUtil {
	private ReflectionUtil() {}
	
	public static int getId(Object entity) {
		Object result = 0;
		String idName = null;
		Class clazz = entity.getClass();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			MajorKey tableId = field.getDeclaredAnnotation(MajorKey.class);
			if (tableId != null) {
				idName = tableId.value();
				break;
			}
		}
		Method method = null;
		try {
			method = clazz.getMethod("get" + idName, null);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		try {
			result = method.invoke(entity, null);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return (Integer) result;
	}
	
	public static String getTabelIdName(Class clazz) {
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			MajorKey tableId = field.getDeclaredAnnotation(MajorKey.class);
			if (tableId != null) {
				return tableId.value();
			}
		}
		return null;
	}
}
