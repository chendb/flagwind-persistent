package com.flagwind.persistent;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.flagwind.persistent.model.Paging;
import com.flagwind.persistent.model.Sorting;
import com.flagwind.persistent.model.Clause;


/**
 * 抽象数据操作仓库
 * @param <E> 实体类型
 * @param <ID> 主键类型
 */
public interface AbstractRepository<E, ID extends Serializable> {

	/**
	 * 单条关联获取
	 * @param id 主键
	 * @return
	 */
	E seekById(ID id);

	/**
	 * 条件关联查询
	 * @param clause 查询条件
	 * @return
	 */
	List<E> seek(Clause clause);

	/**
	 * 单条获取
	 * @param id 主键
	 * @return
	 */
	E getById(ID id);

	/**
	 * 单条插入
	 * @param entity 实体
	 * @param <S> 实体类型
	 */
	<S extends E> void insert(S entity);

	/**
	 * 批量插入
	 * @param entities 实体集
	 * @param <S> 实体类型
	 */
	<S extends E> void insertList(Iterable<S> entities);

	/**
	 * 单条更新
	 * @param entity 实体
	 * @param <S> 实体类型
	 */
	<S extends E> void update(S entity);

	/**
	 * 批量更新
	 * @param list 要更新实体
	 * @param <S> 实体类型
	 */
	<S extends E> void updateList(List<S> list);

	/**
	 * 修改实体
	 * @param map 要修改的信息
	 * @param clause 条件
	 */
	void modify(HashMap<String, Object> map,Clause clause);

	/**
	 * 主键删除
	 * @param id 主键
	 * @return 影响条件
	 */
	int deleteById(ID id);

	/**
	 * 条件删除
	 * @param clause
	 * @return
	 */
	int delete(Clause clause);

	/**
	 * 数量统计
	 * @param clause
	 * @return 数量
	 */
	long count(Clause clause);

	/**
	 * 条件查询
	 * @param clause 查询条件
	 * @return
	 */
	List<E> query(Clause clause);

	/**
	 * 分页查询
	 * @param clause 查询条件
	 * @param page 分页信息
	 * @param sorts 排序信息
	 * @return 分页查询结果
	 */
	List<E> page(Clause clause, Paging page, Sorting[] sorts);

	/**
	 * 按指定的索引范围查询
	 * @param clause 查询条件
	 * @param startIndex 开始索引
	 * @param endIndex 结束索引
	 * @param sorts 排序信息
	 * @return 实体集合
	 */
	List<E> take(Clause clause, int startIndex, int endIndex, Sorting[] sorts);

	/**
	 * 查询所有实体信息
	 * @return 实体集合
	 */
	List<E> getAll();

	/**
	 * 选择性查询
	 * @param table 表名
	 * @param fields 字段
	 * @param clause 条件
	 * @param sortings 排序
	 * @return
	 */
	List<Map<String,Object>> querySelective(String table, List<QueryField> fields, Clause clause,Integer startIndex,Integer endIndex, Sorting[] sortings);

 }