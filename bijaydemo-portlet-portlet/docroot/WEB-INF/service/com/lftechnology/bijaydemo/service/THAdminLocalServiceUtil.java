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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the t h admin local service. This utility wraps {@link com.lftechnology.bijaydemo.service.impl.THAdminLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author bijay
 * @see THAdminLocalService
 * @see com.lftechnology.bijaydemo.service.base.THAdminLocalServiceBaseImpl
 * @see com.lftechnology.bijaydemo.service.impl.THAdminLocalServiceImpl
 * @generated
 */
public class THAdminLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.lftechnology.bijaydemo.service.impl.THAdminLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the t h admin to the database. Also notifies the appropriate model listeners.
	*
	* @param thAdmin the t h admin
	* @return the t h admin that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.bijaydemo.model.THAdmin addTHAdmin(
		com.lftechnology.bijaydemo.model.THAdmin thAdmin)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTHAdmin(thAdmin);
	}

	/**
	* Creates a new t h admin with the primary key. Does not add the t h admin to the database.
	*
	* @param id the primary key for the new t h admin
	* @return the new t h admin
	*/
	public static com.lftechnology.bijaydemo.model.THAdmin createTHAdmin(
		long id) {
		return getService().createTHAdmin(id);
	}

	/**
	* Deletes the t h admin with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the t h admin
	* @return the t h admin that was removed
	* @throws PortalException if a t h admin with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.bijaydemo.model.THAdmin deleteTHAdmin(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTHAdmin(id);
	}

	/**
	* Deletes the t h admin from the database. Also notifies the appropriate model listeners.
	*
	* @param thAdmin the t h admin
	* @return the t h admin that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.bijaydemo.model.THAdmin deleteTHAdmin(
		com.lftechnology.bijaydemo.model.THAdmin thAdmin)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTHAdmin(thAdmin);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.lftechnology.bijaydemo.model.THAdmin fetchTHAdmin(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTHAdmin(id);
	}

	/**
	* Returns the t h admin with the primary key.
	*
	* @param id the primary key of the t h admin
	* @return the t h admin
	* @throws PortalException if a t h admin with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.bijaydemo.model.THAdmin getTHAdmin(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTHAdmin(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.lftechnology.bijaydemo.model.THAdmin> getTHAdmins(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTHAdmins(start, end);
	}

	/**
	* Returns the number of t h admins.
	*
	* @return the number of t h admins
	* @throws SystemException if a system exception occurred
	*/
	public static int getTHAdminsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTHAdminsCount();
	}

	/**
	* Updates the t h admin in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param thAdmin the t h admin
	* @return the t h admin that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.bijaydemo.model.THAdmin updateTHAdmin(
		com.lftechnology.bijaydemo.model.THAdmin thAdmin)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTHAdmin(thAdmin);
	}

	/**
	* Updates the t h admin in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param thAdmin the t h admin
	* @param merge whether to merge the t h admin with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the t h admin that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.bijaydemo.model.THAdmin updateTHAdmin(
		com.lftechnology.bijaydemo.model.THAdmin thAdmin, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTHAdmin(thAdmin, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.lftechnology.bijaydemo.model.THAdmin add(
		com.lftechnology.bijaydemo.model.THAdmin THAdmin) {
		return getService().add(THAdmin);
	}

	public static com.lftechnology.bijaydemo.model.THAdmin get(long id) {
		return getService().get(id);
	}

	public static com.lftechnology.bijaydemo.model.THAdmin update(
		com.lftechnology.bijaydemo.model.THAdmin THAdmin) {
		return getService().update(THAdmin);
	}

	public static com.lftechnology.bijaydemo.model.THAdmin delete(long id) {
		return getService().delete(id);
	}

	public static java.util.List<com.lftechnology.bijaydemo.model.THAdmin> fetchAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAll();
	}

	public static void clearService() {
		_service = null;
	}

	public static THAdminLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					THAdminLocalService.class.getName());

			if (invokableLocalService instanceof THAdminLocalService) {
				_service = (THAdminLocalService)invokableLocalService;
			}
			else {
				_service = new THAdminLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(THAdminLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(THAdminLocalService service) {
	}

	private static THAdminLocalService _service;
}