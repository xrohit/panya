package com.airavat.panya.dao.impl;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.airavat.panya.db.dao.PanyaDao;

@Repository
public abstract class PanyaDaoImpl<T> implements PanyaDao<T> {

	// private static final Logger LOG = null;

	@PersistenceContext
	protected EntityManager entityManager;

	private final Class<T> daoClassType;

	public PanyaDaoImpl(Class<T> type) {
		this.daoClassType = type;
	}

	@Override
	public long count(final Map<String, Object> params) {

		// LOG.debug("counting instances of : " + daoClassType.getClass());
		try {
			final StringBuffer queryString = new StringBuffer(
					"SELECT count(o) from ");

			queryString.append(daoClassType.getSimpleName()).append(" o ");
			queryString.append(this.getQueryClauses(params, null));

			final Query query = this.entityManager.createQuery(queryString
					.toString());

			// LOG.debug("counting successful for instances of : "
			// + daoClassType.getClass());

			return (Long) query.getSingleResult();

		} catch (RuntimeException re) {
			// LOG.error("counting failed", re);
			throw re;
		}
	}

	@Override
	public T persist(final T t) {

		// LOG.debug("persisting instance of : " + t.getClass());
		try {
			entityManager.persist(t);
			// LOG.debug("persisting successful for instance of : " +
			// t.getClass());
			return t;
		} catch (RuntimeException re) {
			// LOG.error("persisting failed", re);
			throw re;

		}
	}

	@Override
	public boolean remove(final Object id) {

		// LOG.debug("removing instance of : " + daoClassType.getClass());
		try {
			this.entityManager.remove(this.entityManager.getReference(
					daoClassType, id));
			// LOG.debug("removing successful for instance of : "
			// + daoClassType.getClass());
			return true;
		} catch (RuntimeException re) {
			// LOG.error("remove failed", re);
			throw re;
		}
	}

	@Override
	public T findById(final Object id) {

		// LOG.debug("finding instance of : " + daoClassType.getClass());
		try {
			T t = this.entityManager.find(daoClassType, id);
			// LOG.debug("finding successful for instance of : "
			// + daoClassType.getClass());
			return t;
		} catch (RuntimeException re) {
			// LOG.error("finding failed", re);
			throw re;
		}
	}

	@Override
	public T merge(final T t) {

		// LOG.debug("merging instance of : " + t.getClass());
		try {
			this.entityManager.merge(t);
			// LOG.debug("merge successful for instance of : " + t.getClass());
			return t;
		} catch (RuntimeException re) {
			// LOG.error("merge failed", re);
			throw re;
		}
	}

	private String getQueryClauses(final Map<String, Object> params,
			final Map<String, Object> orderByParams) {
		final StringBuffer queryStr = new StringBuffer();
		if (params != null && !params.isEmpty()) {
			queryStr.append(" where ");
			for (Iterator<Entry<String, Object>> iterator = params.entrySet()
					.iterator(); iterator.hasNext();) {
				Entry<String, Object> entry = iterator.next();
				if (entry.getValue() instanceof Boolean) {
					queryStr.append(entry.getKey()).append(" is ")
							.append(entry.getValue()).append(" ");
				} else {
					if (entry.getValue() instanceof Number) {
						queryStr.append(entry.getKey()).append(" = ")
								.append(entry.getValue());
					} else {
						// string equality
						queryStr.append(entry.getKey()).append(" = '")
								.append(entry.getValue()).append("'");
					}
				}
				if (iterator.hasNext()) {
					queryStr.append(" and ");
				}
			}
		}
		if (orderByParams != null && !orderByParams.isEmpty()) {
			queryStr.append(" order by ");
			for (Iterator<Entry<String, Object>> iterator = orderByParams
					.entrySet().iterator(); iterator.hasNext();) {
				Entry<String, Object> entry = iterator.next();
				queryStr.append(entry.getKey()).append(" ");
				if (entry.getValue() != null) {
					queryStr.append(entry.getValue());
				}
				if (iterator.hasNext()) {
					queryStr.append(", ");
				}
			}
		}
		return queryStr.toString();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
