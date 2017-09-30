package com.joker.quickweb.service;

import java.util.List;

/**
 * 公共复合操作service接口
 * @author joker
 *
 * @param <T>
 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
 */
public interface ICommonService <T> extends IService<T> {
	
	/**
	 * 
	 * @param ids
	 * @param beanClass
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	public void deleteByIds(String[] ids,Class beanClass);
	
	/**
	 * 
	 * @param ids
	 * @param beanClass
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	public List<T> selectListByIds(String[] ids,Class beanClass);
	
	/**
	 * 
	 * @param list
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	public void saveOrUpdateList(List<T> list);
	
	/**
	 * 
	 * @param entity
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	public void saveOrUpdate(T entity);
}
