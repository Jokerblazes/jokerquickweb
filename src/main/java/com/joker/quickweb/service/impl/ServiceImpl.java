package com.joker.quickweb.service.impl;

import java.util.List;

import com.joker.quickweb.dao.BaseDao;
import com.joker.quickweb.entity.Page;
import com.joker.quickweb.service.IService;

/**
 * IService默认实现类
 * @author joker
 *
 * @param <M>
 * @param <T>
 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
 */
public class ServiceImpl<M extends BaseDao<T>, T> implements IService<T> {

	protected M baseDao;

	public int insert(T t) {
		return baseDao.insert(t);
	}
	
	public int update(T t) {
		return baseDao.update(t);
	}
	
	public int delete(T t) {
		return baseDao.delete(t);
	}
	
	public List<T> selectList(T t) {
		return baseDao.selectList(t);
	}
	
	public List<T> selectList(T t,Page page) {
		return baseDao.selectList(t, page);
	}

	public int delete(int id,Class beanClass) {
		return baseDao.delete(id, beanClass);
	}

	public T selectT(int id, Class beanClass) {
		return baseDao.selectT(id, beanClass);
	}
	
	
//	public int deleteByPrimaryKey(Integer id) {
//		return baseDao.insert(t);
//	}
//
//	public int insert(T record) {
//		return baseDao.insert(record);
//	}
//
//	public int insertSelective(T record) {
//		return baseDao.insertSelective(record);
//	}
//
//	public T selectByPrimaryKey(Integer id) {
//		return baseDao.selectByPrimaryKey(id);
//	}
//
//	public int updateByPrimaryKeySelective(T record) {
//		return baseDao.updateByPrimaryKeySelective(record);
//	}
//
//	public int updateByPrimaryKey(T record) {
//		return baseDao.updateByPrimaryKey(record);
//	}
//
//	public T selectEntity(T entity) {
//		return baseDao.selectEntity(entity);
//	}
//
//	public List<T> selectList(T entity) {
//		return baseDao.selectList(entity);
//	}
//
//	public Map<String,Object> selectListByPage(T entity) {
//		Map<String,Object> map = new HashMap<String, Object>();
//		List<T> data = baseDao.selectListByPage(entity);
//		Page<T> page = (Page<T>) data;
//		map.put("page", new PageDto(page));
//		map.put("data", data);
//		return map;
//	}
	
	
	

}
