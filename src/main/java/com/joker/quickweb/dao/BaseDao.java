package com.joker.quickweb.dao;

import java.util.List;

import com.joker.quickweb.entity.Page;


public interface BaseDao<T> {
	
	/**
	 * 插入数据库
	 * @param t(实体)
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	int insert(T t);
	
	/**
	 * 修改实体对象
	 * @param t
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	int update(T t);
	
	/**
	 * 删除实体对象
	 * @param t
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	int delete(T t);
	
	/**
	 * 删除对象(通过id)
	 * @param id
	 * @param beanClass(实体对象类)
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	int delete(int id,Class beanClass);
	
	/**
	 * 查找对象list不分页
	 * @param t
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	List<T> selectList(T t);
	
	/**
	 * 查找对象list并分页
	 * @param t
	 * @param page
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	List<T> selectList(T t,Page page);
	
	/**
	 * 查找对象(通过id)
	 * @param id
	 * @param beanClass(实体对象类)
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	T selectT(int id,Class beanClass);
	
}
