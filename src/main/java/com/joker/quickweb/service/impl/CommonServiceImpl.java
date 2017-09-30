package com.joker.quickweb.service.impl;

import java.util.ArrayList;
import java.util.List;


import com.joker.quickweb.dao.BaseDao;
import com.joker.quickweb.service.ICommonService;
import com.joker.quickweb.utils.ReflectionUtil;
import com.joker.tx.entity.Transaction;

/**
 * ICommonService默认实现类
 * @author joker
 *
 * @param <M>
 * @param <T>
 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
 */
public class CommonServiceImpl<M extends BaseDao<T>, T> extends ServiceImpl<M, T> implements ICommonService<T> {
	
	@Transaction
	public void deleteByIds(String[] ids,Class beanClass) {
		for (String id : ids) 
			baseDao.delete(Integer.parseInt(id),beanClass);
	}
	

	@Transaction
	public void saveOrUpdateList(List<T> list) {
		for (T entity : list) {
			saveOrUpdate(entity);
		}
	}
	
	public void saveOrUpdate(T entity) {
		int id = ReflectionUtil.getId(entity);
		if (id != 0) 
			baseDao.update(entity);
		else
			baseDao.insert(entity);
	}

	@Transaction
	public List<T> selectListByIds(String[] ids, Class beanClass) {
		List<T> list = new ArrayList<T>();
		for (String id : ids) {
			T entity = baseDao.selectT(Integer.parseInt(id),beanClass);
			list.add(entity);
		}
		return list;
	}
	
}
