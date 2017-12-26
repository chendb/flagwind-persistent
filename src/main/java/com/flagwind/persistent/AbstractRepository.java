package com.flagwind.persistent;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import com.flagwind.persistent.model.Paging;
import com.flagwind.persistent.model.Sorting;
import com.flagwind.persistent.model.Clause;



public interface AbstractRepository<E, ID extends Serializable> {

	E getById(ID id);

	<S extends E> void insert(S entity);

	<S extends E> void insertList(Iterable<S> entities);

	<S extends E> void update(S entity);

	<S extends E> void updateList(List<S> list);
	
	<S extends E> void updatePart(HashMap<String, Object> map,Clause clause);

	int deleteById(ID id);

	int delete(Clause query);

	long count(Clause query);

	List<E> find(Clause query);

	List<E> page(Clause clause, Paging page, Sorting[] sorts);

	List<E> take(Clause query, int startIndex, int endIndex);

	List<E> getAll();
}