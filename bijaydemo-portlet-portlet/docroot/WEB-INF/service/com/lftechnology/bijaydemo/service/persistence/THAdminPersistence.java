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

package com.lftechnology.bijaydemo.service.persistence;

import com.lftechnology.bijaydemo.model.THAdmin;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the t h admin service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author bijay
 * @see THAdminPersistenceImpl
 * @see THAdminUtil
 * @generated
 */
public interface THAdminPersistence extends BasePersistence<THAdmin> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link THAdminUtil} to access the t h admin persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the t h admin in the entity cache if it is enabled.
	*
	* @param thAdmin the t h admin
	*/
	public void cacheResult(com.lftechnology.bijaydemo.model.THAdmin thAdmin);

	/**
	* Caches the t h admins in the entity cache if it is enabled.
	*
	* @param thAdmins the t h admins
	*/
	public void cacheResult(
		java.util.List<com.lftechnology.bijaydemo.model.THAdmin> thAdmins);

	/**
	* Creates a new t h admin with the primary key. Does not add the t h admin to the database.
	*
	* @param id the primary key for the new t h admin
	* @return the new t h admin
	*/
	public com.lftechnology.bijaydemo.model.THAdmin create(long id);

	/**
	* Removes the t h admin with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the t h admin
	* @return the t h admin that was removed
	* @throws com.lftechnology.bijaydemo.NoSuchTHAdminException if a t h admin with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.bijaydemo.model.THAdmin remove(long id)
		throws com.lftechnology.bijaydemo.NoSuchTHAdminException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.lftechnology.bijaydemo.model.THAdmin updateImpl(
		com.lftechnology.bijaydemo.model.THAdmin thAdmin, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the t h admin with the primary key or throws a {@link com.lftechnology.bijaydemo.NoSuchTHAdminException} if it could not be found.
	*
	* @param id the primary key of the t h admin
	* @return the t h admin
	* @throws com.lftechnology.bijaydemo.NoSuchTHAdminException if a t h admin with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.bijaydemo.model.THAdmin findByPrimaryKey(long id)
		throws com.lftechnology.bijaydemo.NoSuchTHAdminException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the t h admin with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the t h admin
	* @return the t h admin, or <code>null</code> if a t h admin with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.bijaydemo.model.THAdmin fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the t h admins.
	*
	* @return the t h admins
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lftechnology.bijaydemo.model.THAdmin> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.lftechnology.bijaydemo.model.THAdmin> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.lftechnology.bijaydemo.model.THAdmin> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t h admins from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t h admins.
	*
	* @return the number of t h admins
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}