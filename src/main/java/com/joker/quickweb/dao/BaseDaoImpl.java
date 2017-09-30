package com.joker.quickweb.dao;

import java.util.List;

import com.joker.jokerORM.instance.SqlHelper;
import com.joker.jokerORM.proxy.SqlProxyFactory;
import com.joker.jokerORM.util.BeanId;
import com.joker.quickweb.entity.Page;
import com.joker.quickweb.utils.ReflectionUtil;

/**
 * BaseDao默认实现类-可直接继承使用
 * @author joker
 *
 * @param <T>
 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
 */
public class BaseDaoImpl<T> implements BaseDao<T> {
	protected SqlHelper helper;
	
	public BaseDaoImpl() {
		helper =  (SqlHelper) SqlProxyFactory.getInstance().getSession();
	}
	
	public int insert(T t) {
		return helper.insert(t);
	}
	
	public int update(T t) {
		return helper.update(t);
	}
	
	public int delete(T t) {
		return helper.delete(t);
	}
	
	public int delete(int id,Class beanClass) {
		final String idName = ReflectionUtil.getTabelIdName(beanClass);
		BeanId beanId = new BeanId(id,idName,beanClass);
		return helper.delete(beanId);
	}
	
	public List<T> selectList(T t) {
		return helper.selectList(t);
	}
	
	public List<T> selectList(T t,Page page) {
		return helper.selectList(t, page);
	}
	
	public T selectT(int id,Class beanClass) {
		final String idName = ReflectionUtil.getTabelIdName(beanClass);
		BeanId beanId = new BeanId(id,idName,beanClass);
		List<T> list = helper.selectV(beanId);
		if (list != null)
			return list.get(0);
		return null;
	}
}
