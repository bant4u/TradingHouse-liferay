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

package com.lftechnology.bijaydemo.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link THAdminLocalService}.
 * </p>
 *
 * @author    bijay
 * @see       THAdminLocalService
 * @generated
 */
public class THAdminLocalServiceWrapper implements THAdminLocalService,
	ServiceWrapper<THAdminLocalService> {
	public THAdminLocalServiceWrapper(THAdminLocalService thAdminLocalService) {
		_thAdminLocalService = thAdminLocalService;
	}

	/**
	* Adds the t h admin to the database. Also notifies the appropriate model listeners.
	*
	* @param thAdmin the t h admin
	* @return the t h admin that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.bijaydemo.model.THAdmin addTHAdmin(
		com.lftechnology.bijaydemo.model.THAdmin thAdmin)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thAdminLocalService.addTHAdmin(thAdmin);
	}

	/**
	* Creates a new t h admin with the primary key. Does not add the t h admin to the database.
	*
	* @param id the primary key for the new t h admin
	* @return the new t h admin
	*/
	public com.lftechnology.bijaydemo.model.THAdmin createTHAdmin(long id) {
		return _thAdminLocalService.createTHAdmin(id);
	}

	/**
	* Deletes the t h admin with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the t h admin
	* @return the t h admin that was removed
	* @throws PortalException if a t h admin with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.bijaydemo.model.THAdmin deleteTHAdmin(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thAdminLocalService.deleteTHAdmin(id);
	}

	/**
	* Deletes the t h admin from the database. Also notifies the appropriate model listeners.
	*
	* @param thAdmin the t h admin
	* @return the t h admin that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.bijaydemo.model.THAdmin deleteTHAdmin(
		com.lftechnology.bijaydemo.model.THAdmin thAdmin)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thAdminLocalService.deleteTHAdmin(thAdmin);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _thAdminLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thAdminLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _thAdminLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thAdminLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thAdminLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.lftechnology.bijaydemo.model.THAdmin fetchTHAdmin(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thAdminLocalService.fetchTHAdmin(id);
	}

	/**
	* Returns the t h admin with the primary key.
	*
	* @param id the primary key of the t h admin
	* @return the t h admin
	* @throws PortalException if a t h admin with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.bijaydemo.model.THAdmin getTHAdmin(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thAdminLocalService.getTHAdmin(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thAdminLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.lftechnology.bijaydemo.model.THAdmin> getTHAdmins(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thAdminLocalService.getTHAdmins(start, end);
	}

	/**
	* Returns the number of t h admins.
	*
	* @return the number of t h admins
	* @throws SystemException if a system exception occurred
	*/
	public int getTHAdminsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thAdminLocalService.getTHAdminsCount();
	}

	/**
	* Updates the t h admin in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param thAdmin the t h admin
	* @return the t h admin that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.bijaydemo.model.THAdmin updateTHAdmin(
		com.lftechnology.bijaydemo.model.THAdmin thAdmin)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thAdminLocalService.updateTHAdmin(thAdmin);
	}

	/**
	* Updates the t h admin in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param thAdmin the t h admin
	* @param merge whether to merge the t h admin with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the t h admin that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.bijaydemo.model.THAdmin updateTHAdmin(
		com.lftechnology.bijaydemo.model.THAdmin thAdmin, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thAdminLocalService.updateTHAdmin(thAdmin, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _thAdminLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_thAdminLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _thAdminLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	public com.lftechnology.bijaydemo.model.THAdmin add(
		com.lftechnology.bijaydemo.model.THAdmin THAdmin) {
		return _thAdminLocalService.add(THAdmin);
	}

	public com.lftechnology.bijaydemo.model.THAdmin get(long id) {
		return _thAdminLocalService.get(id);
	}

	public com.lftechnology.bijaydemo.model.THAdmin update(
		com.lftechnology.bijaydemo.model.THAdmin THAdmin) {
		return _thAdminLocalService.update(THAdmin);
	}

	public com.lftechnology.bijaydemo.model.THAdmin delete(long id) {
		return _thAdminLocalService.delete(id);
	}

	public java.util.List<com.lftechnology.bijaydemo.model.THAdmin> fetchAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thAdminLocalService.fetchAll();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public THAdminLocalService getWrappedTHAdminLocalService() {
		return _thAdminLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTHAdminLocalService(
		THAdminLocalService thAdminLocalService) {
		_thAdminLocalService = thAdminLocalService;
	}

	public THAdminLocalService getWrappedService() {
		return _thAdminLocalService;
	}

	public void setWrappedService(THAdminLocalService thAdminLocalService) {
		_thAdminLocalService = thAdminLocalService;
	}

	private THAdminLocalService _thAdminLocalService;
}