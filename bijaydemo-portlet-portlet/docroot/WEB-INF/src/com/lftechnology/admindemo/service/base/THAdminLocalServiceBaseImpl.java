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

package com.lftechnology.admindemo.service.base;

import com.lftechnology.bijaydemo.model.THAdmin;
import com.lftechnology.bijaydemo.service.THAdminLocalService;
import com.lftechnology.bijaydemo.service.persistence.THAdminPersistence;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the t h admin local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.lftechnology.admindemo.service.impl.THAdminLocalServiceImpl}.
 * </p>
 *
 * @author bijay
 * @see com.lftechnology.admindemo.service.impl.THAdminLocalServiceImpl
 * @see com.lftechnology.bijaydemo.service.THAdminLocalServiceUtil
 * @generated
 */
public abstract class THAdminLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements THAdminLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.lftechnology.bijaydemo.service.THAdminLocalServiceUtil} to access the t h admin local service.
	 */

	/**
	 * Adds the t h admin to the database. Also notifies the appropriate model listeners.
	 *
	 * @param thAdmin the t h admin
	 * @return the t h admin that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public THAdmin addTHAdmin(THAdmin thAdmin) throws SystemException {
		thAdmin.setNew(true);

		return thAdminPersistence.update(thAdmin, false);
	}

	/**
	 * Creates a new t h admin with the primary key. Does not add the t h admin to the database.
	 *
	 * @param id the primary key for the new t h admin
	 * @return the new t h admin
	 */
	public THAdmin createTHAdmin(long id) {
		return thAdminPersistence.create(id);
	}

	/**
	 * Deletes the t h admin with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the t h admin
	 * @return the t h admin that was removed
	 * @throws PortalException if a t h admin with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public THAdmin deleteTHAdmin(long id)
		throws PortalException, SystemException {
		return thAdminPersistence.remove(id);
	}

	/**
	 * Deletes the t h admin from the database. Also notifies the appropriate model listeners.
	 *
	 * @param thAdmin the t h admin
	 * @return the t h admin that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public THAdmin deleteTHAdmin(THAdmin thAdmin) throws SystemException {
		return thAdminPersistence.remove(thAdmin);
	}

	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(THAdmin.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return thAdminPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return thAdminPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return thAdminPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return thAdminPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public THAdmin fetchTHAdmin(long id) throws SystemException {
		return thAdminPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the t h admin with the primary key.
	 *
	 * @param id the primary key of the t h admin
	 * @return the t h admin
	 * @throws PortalException if a t h admin with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public THAdmin getTHAdmin(long id) throws PortalException, SystemException {
		return thAdminPersistence.findByPrimaryKey(id);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return thAdminPersistence.findByPrimaryKey(primaryKeyObj);
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
	public List<THAdmin> getTHAdmins(int start, int end)
		throws SystemException {
		return thAdminPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of t h admins.
	 *
	 * @return the number of t h admins
	 * @throws SystemException if a system exception occurred
	 */
	public int getTHAdminsCount() throws SystemException {
		return thAdminPersistence.countAll();
	}

	/**
	 * Updates the t h admin in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param thAdmin the t h admin
	 * @return the t h admin that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public THAdmin updateTHAdmin(THAdmin thAdmin) throws SystemException {
		return updateTHAdmin(thAdmin, true);
	}

	/**
	 * Updates the t h admin in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param thAdmin the t h admin
	 * @param merge whether to merge the t h admin with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the t h admin that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public THAdmin updateTHAdmin(THAdmin thAdmin, boolean merge)
		throws SystemException {
		thAdmin.setNew(false);

		return thAdminPersistence.update(thAdmin, merge);
	}

	/**
	 * Returns the t h admin local service.
	 *
	 * @return the t h admin local service
	 */
	public THAdminLocalService getTHAdminLocalService() {
		return thAdminLocalService;
	}

	/**
	 * Sets the t h admin local service.
	 *
	 * @param thAdminLocalService the t h admin local service
	 */
	public void setTHAdminLocalService(THAdminLocalService thAdminLocalService) {
		this.thAdminLocalService = thAdminLocalService;
	}

	/**
	 * Returns the t h admin persistence.
	 *
	 * @return the t h admin persistence
	 */
	public THAdminPersistence getTHAdminPersistence() {
		return thAdminPersistence;
	}

	/**
	 * Sets the t h admin persistence.
	 *
	 * @param thAdminPersistence the t h admin persistence
	 */
	public void setTHAdminPersistence(THAdminPersistence thAdminPersistence) {
		this.thAdminPersistence = thAdminPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		PersistedModelLocalServiceRegistryUtil.register("com.lftechnology.bijaydemo.model.THAdmin",
			thAdminLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.lftechnology.bijaydemo.model.THAdmin");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
	}

	protected Class<?> getModelClass() {
		return THAdmin.class;
	}

	protected String getModelClassName() {
		return THAdmin.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = thAdminPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = THAdminLocalService.class)
	protected THAdminLocalService thAdminLocalService;
	@BeanReference(type = THAdminPersistence.class)
	protected THAdminPersistence thAdminPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private THAdminLocalServiceClpInvoker _clpInvoker = new THAdminLocalServiceClpInvoker();
}