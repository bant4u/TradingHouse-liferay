/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.lftechnology.admindemo.service.persistence;

import com.lftechnology.admindemo.model.impl.THAdminImpl;
import com.lftechnology.admindemo.model.impl.THAdminModelImpl;
import com.lftechnology.bijaydemo.NoSuchTHAdminException;
import com.lftechnology.bijaydemo.model.THAdmin;
import com.lftechnology.bijaydemo.service.persistence.THAdminPersistence;
import com.lftechnology.bijaydemo.service.persistence.THAdminUtil;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t h admin service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bijay
 * @see THAdminPersistence
 * @see THAdminUtil
 * @generated
 */
public class THAdminPersistenceImpl extends BasePersistenceImpl<THAdmin>
	implements THAdminPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link THAdminUtil} to access the t h admin persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = THAdminImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(THAdminModelImpl.ENTITY_CACHE_ENABLED,
			THAdminModelImpl.FINDER_CACHE_ENABLED, THAdminImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(THAdminModelImpl.ENTITY_CACHE_ENABLED,
			THAdminModelImpl.FINDER_CACHE_ENABLED, THAdminImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(THAdminModelImpl.ENTITY_CACHE_ENABLED,
			THAdminModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the t h admin in the entity cache if it is enabled.
	 *
	 * @param thAdmin the t h admin
	 */
	public void cacheResult(THAdmin thAdmin) {
		EntityCacheUtil.putResult(THAdminModelImpl.ENTITY_CACHE_ENABLED,
			THAdminImpl.class, thAdmin.getPrimaryKey(), thAdmin);

		thAdmin.resetOriginalValues();
	}

	/**
	 * Caches the t h admins in the entity cache if it is enabled.
	 *
	 * @param thAdmins the t h admins
	 */
	public void cacheResult(List<THAdmin> thAdmins) {
		for (THAdmin thAdmin : thAdmins) {
			if (EntityCacheUtil.getResult(
						THAdminModelImpl.ENTITY_CACHE_ENABLED,
						THAdminImpl.class, thAdmin.getPrimaryKey()) == null) {
				cacheResult(thAdmin);
			}
			else {
				thAdmin.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all t h admins.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(THAdminImpl.class.getName());
		}

		EntityCacheUtil.clearCache(THAdminImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the t h admin.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(THAdmin thAdmin) {
		EntityCacheUtil.removeResult(THAdminModelImpl.ENTITY_CACHE_ENABLED,
			THAdminImpl.class, thAdmin.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<THAdmin> thAdmins) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (THAdmin thAdmin : thAdmins) {
			EntityCacheUtil.removeResult(THAdminModelImpl.ENTITY_CACHE_ENABLED,
				THAdminImpl.class, thAdmin.getPrimaryKey());
		}
	}

	/**
	 * Creates a new t h admin with the primary key. Does not add the t h admin to the database.
	 *
	 * @param id the primary key for the new t h admin
	 * @return the new t h admin
	 */
	public THAdmin create(long id) {
		THAdmin thAdmin = new THAdminImpl();

		thAdmin.setNew(true);
		thAdmin.setPrimaryKey(id);

		return thAdmin;
	}

	/**
	 * Removes the t h admin with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the t h admin
	 * @return the t h admin that was removed
	 * @throws com.lftechnology.bijaydemo.NoSuchTHAdminException if a t h admin with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public THAdmin remove(long id)
		throws NoSuchTHAdminException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the t h admin with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t h admin
	 * @return the t h admin that was removed
	 * @throws com.lftechnology.bijaydemo.NoSuchTHAdminException if a t h admin with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THAdmin remove(Serializable primaryKey)
		throws NoSuchTHAdminException, SystemException {
		Session session = null;

		try {
			session = openSession();

			THAdmin thAdmin = (THAdmin)session.get(THAdminImpl.class, primaryKey);

			if (thAdmin == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTHAdminException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(thAdmin);
		}
		catch (NoSuchTHAdminException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected THAdmin removeImpl(THAdmin thAdmin) throws SystemException {
		thAdmin = toUnwrappedModel(thAdmin);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, thAdmin);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(thAdmin);

		return thAdmin;
	}

	@Override
	public THAdmin updateImpl(
		com.lftechnology.bijaydemo.model.THAdmin thAdmin, boolean merge)
		throws SystemException {
		thAdmin = toUnwrappedModel(thAdmin);

		boolean isNew = thAdmin.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, thAdmin, merge);

			thAdmin.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(THAdminModelImpl.ENTITY_CACHE_ENABLED,
			THAdminImpl.class, thAdmin.getPrimaryKey(), thAdmin);

		return thAdmin;
	}

	protected THAdmin toUnwrappedModel(THAdmin thAdmin) {
		if (thAdmin instanceof THAdminImpl) {
			return thAdmin;
		}

		THAdminImpl thAdminImpl = new THAdminImpl();

		thAdminImpl.setNew(thAdmin.isNew());
		thAdminImpl.setPrimaryKey(thAdmin.getPrimaryKey());

		thAdminImpl.setId(thAdmin.getId());
		thAdminImpl.setCompanyId(thAdmin.getCompanyId());
		thAdminImpl.setName(thAdmin.getName());
		thAdminImpl.setPassword(thAdmin.getPassword());
		thAdminImpl.setGroupId(thAdmin.getGroupId());

		return thAdminImpl;
	}

	/**
	 * Returns the t h admin with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t h admin
	 * @return the t h admin
	 * @throws com.liferay.portal.NoSuchModelException if a t h admin with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THAdmin findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the t h admin with the primary key or throws a {@link com.lftechnology.bijaydemo.NoSuchTHAdminException} if it could not be found.
	 *
	 * @param id the primary key of the t h admin
	 * @return the t h admin
	 * @throws com.lftechnology.bijaydemo.NoSuchTHAdminException if a t h admin with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public THAdmin findByPrimaryKey(long id)
		throws NoSuchTHAdminException, SystemException {
		THAdmin thAdmin = fetchByPrimaryKey(id);

		if (thAdmin == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchTHAdminException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return thAdmin;
	}

	/**
	 * Returns the t h admin with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t h admin
	 * @return the t h admin, or <code>null</code> if a t h admin with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public THAdmin fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the t h admin with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the t h admin
	 * @return the t h admin, or <code>null</code> if a t h admin with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public THAdmin fetchByPrimaryKey(long id) throws SystemException {
		THAdmin thAdmin = (THAdmin)EntityCacheUtil.getResult(THAdminModelImpl.ENTITY_CACHE_ENABLED,
				THAdminImpl.class, id);

		if (thAdmin == _nullTHAdmin) {
			return null;
		}

		if (thAdmin == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				thAdmin = (THAdmin)session.get(THAdminImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (thAdmin != null) {
					cacheResult(thAdmin);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(THAdminModelImpl.ENTITY_CACHE_ENABLED,
						THAdminImpl.class, id, _nullTHAdmin);
				}

				closeSession(session);
			}
		}

		return thAdmin;
	}

	/**
	 * Returns all the t h admins.
	 *
	 * @return the t h admins
	 * @throws SystemException if a system exception occurred
	 */
	public List<THAdmin> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the t h admins.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t h admins
	 * @param end the upper bound of the range of t h admins (not inclusive)
	 * @return the range of t h admins
	 * @throws SystemException if a system exception occurred
	 */
	public List<THAdmin> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the t h admins.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t h admins
	 * @param end the upper bound of the range of t h admins (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of t h admins
	 * @throws SystemException if a system exception occurred
	 */
	public List<THAdmin> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<THAdmin> list = (List<THAdmin>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THADMIN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THADMIN;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<THAdmin>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<THAdmin>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the t h admins from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (THAdmin thAdmin : findAll()) {
			remove(thAdmin);
		}
	}

	/**
	 * Returns the number of t h admins.
	 *
	 * @return the number of t h admins
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_THADMIN);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the t h admin persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.lftechnology.bijaydemo.model.THAdmin")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<THAdmin>> listenersList = new ArrayList<ModelListener<THAdmin>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<THAdmin>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(THAdminImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = THAdminPersistence.class)
	protected THAdminPersistence thAdminPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_THADMIN = "SELECT thAdmin FROM THAdmin thAdmin";
	private static final String _SQL_COUNT_THADMIN = "SELECT COUNT(thAdmin) FROM THAdmin thAdmin";
	private static final String _ORDER_BY_ENTITY_ALIAS = "thAdmin.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No THAdmin exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(THAdminPersistenceImpl.class);
	private static THAdmin _nullTHAdmin = new THAdminImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<THAdmin> toCacheModel() {
				return _nullTHAdminCacheModel;
			}
		};

	private static CacheModel<THAdmin> _nullTHAdminCacheModel = new CacheModel<THAdmin>() {
			public THAdmin toEntityModel() {
				return _nullTHAdmin;
			}
		};
}