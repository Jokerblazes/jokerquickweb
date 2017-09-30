package com.joker.quickweb.service;

import java.util.List;

import com.joker.quickweb.entity.Page;

/**
 * 公共基础操作service接口类
 * @author joker
 *{@link https://github.com/Jokerblazes/jokerquickweb.git}
 * @param <T>
 */
public interface IService<T> {
	/**
	 * 插入数据库
	 * @param t(实体)
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	public int insert(T t);
	
	/**
	 * 修改实体对象
	 * @param t
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	public int update(T t);
	
	/**
	 * 删除实体对象
	 * @param t
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	public int delete(T t);
	
	/**
	 * 删除对象(通过id)
	 * @param id
	 * @param beanClass(实体对象类)
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	public int delete(int id,Class beanClass);
	
	/**
	 * 查找对象list不分页
	 * @param t
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	public List<T> selectList(T t);
	
	/**
	 * 查找对象list并分页
	 * @param t
	 * @param page
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	public List<T> selectList(T t,Page page);
	
	/**
	 * 查找对象(通过id)
	 * @param id
	 * @param beanClass(实体对象类)
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	public T selectT(int id,Class beanClass);
	
	
//	/**
//	 * 根据主键删除
//	 * @param id
//	 * @return
//	 * @author joker
//	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
//	 */
//	int deleteByPrimaryKey(Integer id);
//
//	/**
//	 * 插入（入参数据不能为空）
//	 * @param record
//	 * @return
//	 * @author joker
//	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
//	 */
//    int insert(T record);
//
//    /**
//     * 
//     * @param record
//     * @return
//     * @author joker
//     * {@link https://github.com/Jokerblazes/jokerquickweb.git}
//     */
//    int insertSelective(T record);
//
//    /**
//     * 
//     * @param id
//     * @return
//     * @author joker
//     * {@link https://github.com/Jokerblazes/jokerquickweb.git}
//     */
//    T selectByPrimaryKey(Integer id);
//
//    /**
//     * 
//     * @param record
//     * @return
//     * @author joker
//     * {@link https://github.com/Jokerblazes/jokerquickweb.git}
//     */
//    int updateByPrimaryKeySelective(T record);
//
//    /**
//     * 根据主键更新
//     * @param record
//     * @return
//     * @author joker
//     * {@link https://github.com/Jokerblazes/jokerquickweb.git}
//     */
//    int updateByPrimaryKey(T record);
//	
//	
//	/**
//	 * 根据条件查询
//	 * @param entity
//	 * @return
//	 * @author joker
//	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
//	 */
//	public T selectEntity(T entity);
//	
//	/**
//	 * 根据条件查询list
//	 * @param entity
//	 * @return
//	 * @author joker
//	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
//	 */
//	public List<T> selectList(T entity);
//	
//	/**
//	 * 根据条件查询list（分页）
//	 * @param entity
//	 * @return
//	 * @author joker
//	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
//	 * page data
//	 */
//	public Map<String,Object> selectListByPage(T entity);
}
