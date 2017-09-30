package com.joker.quickweb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.joker.quickweb.entity.Page;
import com.joker.quickweb.entity.Result;
import com.joker.quickweb.service.ICommonService;
import com.joker.quickweb.utils.WebUtils;
import com.joker.webmvc.annotation.RequestMapping;
import com.joker.webmvc.annotation.ResponseBody;

/**
 * controller抽象父类
 * @author joker
 *{@link https://github.com/Jokerblazes/jokerquickweb.git}
 * @param <T>
 */
public abstract class AbstractBaseController<T> {
	
	protected ICommonService<T> commonService;
	
	protected Class<T> beanClass; 
	
	/**
	 * 根据id删除对象
	 * @param id
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	@RequestMapping(value="/delete")
	@ResponseBody
	public Result<Integer> delete(int id) {
		WebUtils.isThrowNullException(id);
		int flag = commonService.delete(id,beanClass);
		Result<Integer> result = new Result<Integer>().buildFlag(flag);
		return result;
	}

	/**
	 * 新建对象
	 * @param entity
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	@RequestMapping(value="/insert")
	@ResponseBody
	public Result<Integer> insertSelective(T entity) {
		WebUtils.isThrowNullException(entity);
		int flag = commonService.insert(entity);
		Result<Integer> result = new Result<Integer>().buildFlag(flag);
		return result;
	}

	/**
	 * 根据id查找对象
	 * @param id
	 * @param request
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	@RequestMapping(value="/selectById")
	public String selectById(int id,HttpServletRequest request) {
		WebUtils.isThrowNullException(id);
		T data = commonService.selectT(id,beanClass);
		request.setAttribute("data", data);
		return "";
	}

	/**
	 * 根据对象id更新对象信息（更改信息）
	 * @param entity
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	@RequestMapping(value="/update")
	@ResponseBody
	public Result<Integer> updateSelective(T entity) {
		WebUtils.isThrowNullException(entity);
		int flag = commonService.update(entity);
		Result<Integer> result = new Result<Integer>().buildFlag(flag);
		return result;
	}
	
//	/**
//	 * 根据对象id更新对象信息（所有提交信息）
//	 * @param entity
//	 * @return
//	 * @author joker
//	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
//	 */
//	@RequestMapping(value="/updateAll")
//	@ResponseBody
//	public Result<Integer> updateByPrimaryKey(T entity) {
//		WebUtils.isThrowNullException(entity);
//		int flag = commonService.update(entity);
//		Result<Integer> result = new Result<Integer>().buildFlag(flag);
//		return result;
//	}

	
	/**
	 * 根据对象部分条件查找对象
	 * @param entity
	 * @param request
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	@RequestMapping(value="/selectEntity")
	public String selectEntity(T entity,HttpServletRequest request) {
		WebUtils.isThrowNullException(entity);
		List<T> list = commonService.selectList(entity);
		T data = null;
		if (list != null)
			data = list.get(0);
		request.setAttribute("data", data);
		return "";
	}

	/**
	 * 查询对象list（可模糊搜索）
	 * @param entity
	 * @param request
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	@RequestMapping(value="/list")
	public String list(T entity,HttpServletRequest request) {
		List<T> data = commonService.selectList(entity);
		request.setAttribute("data", data);
		return "";
	}

	/**
	 * 查询对象list（可模糊搜索,可分页）
	 * @param entity
	 * @param request
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	@RequestMapping(value="/listByPage")
	public String listByPage(T entity,Page page,HttpServletRequest request) {
		List<T> list = commonService.selectList(entity, page);
		request.setAttribute("data",list);
		request.setAttribute("page",page);
		return "";
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	@RequestMapping(value="/deleteByIds")
	@ResponseBody
	public Result<Integer> deleteByIds(String ids) {
		String[] idArray = ids.split(",");
		WebUtils.isThrowNumberException(idArray);
		commonService.deleteByIds(idArray,beanClass);
		Result<Integer> result = new Result<Integer>().buildFlag(1);
		return result;
	}
	
	/**
	 * 添加或者删除
	 * @param entity
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	@RequestMapping(value="/saveOrUpdate")
	@ResponseBody
	public Result<Integer> saveOrUpdate(T entity) {
		commonService.saveOrUpdate(entity);
		Result<Integer> result = new Result<Integer>().buildFlag(1);
		return result;
	}
	
	/**
	 * 根据id数组查询对象list
	 * @param ids
	 * @param request
	 * @return
	 * @author joker
	 * {@link https://github.com/Jokerblazes/jokerquickweb.git}
	 */
	@RequestMapping(value="/selectListByIds")
	public String selectListByIds(String ids,HttpServletRequest request) {
		String[] idArray = ids.split(",");
		WebUtils.isThrowNumberException(idArray);
		commonService.selectListByIds(idArray,beanClass);
		return "";
	}
	
	
}
