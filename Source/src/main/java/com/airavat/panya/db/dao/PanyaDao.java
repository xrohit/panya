package com.airavat.panya.db.dao;

import java.util.Map;

public interface PanyaDao<T> {

	long count(Map<String, Object> params);

	T persist(T t);

	boolean remove(Object id);

	T findById(Object id);

	T merge(T t);
}
